package puzzlerChecker;

public class DiagonalSudokuChecker extends SudokuPuzzleChecker{

	//private int[][] grid;
	private boolean check[] = new boolean[9];
	private SimpleSudokuChecker sudokuChecker;
	
	public DiagonalSudokuChecker(int[][] grid)
	{
		sudokuChecker = new SimpleSudokuChecker(grid);
		this.grid = grid;
	}

	public String checkPuzzleValid()
	{
		String result = sudokuChecker.checkPuzzleValid();
		if (!result.equals("Puzzle VALID"))
		{
			return result;
		}
		
		// check diagonals
		System.out.println("Checking downward diagonal");
		resetCheckVector();
		for (int diag=0; diag<9; diag++)
		{
			if (check[grid[diag][diag]-1] != false)
			{
				return "Puzzle not VALID - problem with downward diagonal";
			}
			check[grid[diag][diag]-1] = true;
		}

		System.out.println("Checking upward diagonal");
		resetCheckVector();
		for (int diag=0; diag<9; diag++)
		{
			if (check[grid[diag][8-diag]-1] != false)
			{
				return "Puzzle not VALID - problem with upward diagonal";
			}
			check[grid[diag][8-diag]-1] = true;
		}


		return "Puzzle VALID";
	}


	public void resetCheckVector()
	{
		for (int index=0; index<9; index++)
		{
			check[index] = false;
		}
	}

}