package puzzlerChecker;

public class WindowSudokuChecker extends SudokuPuzzleChecker {

	//private int[][] grid;
	private boolean check[] = new boolean[9];
	private SimpleSudokuChecker sudokuChecker;

	
	public WindowSudokuChecker(int[][] grid)
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
		
		// check window1
		System.out.println("Checking northwest window");
		resetCheckVector();
		for (int row=1; row<4; row++)
		{
		    for (int col=1; col<4; col++)
		    {
			//System.out.println("Grid value is: "+ grid[row][col]);
			if (check[grid[row][col]-1] != false)
			{
			   return "Puzzle not VALID - problem with northwest window";
			}
			check[grid[row][col]-1] = true;
		    }
		}

		// check window2
		System.out.println("Checking northeast window");
		resetCheckVector();
		for (int row=1; row<4; row++)
		{
		    for (int col=5; col<8; col++)
		    {
			//System.out.println("Grid value is: "+ grid[row][col]);
			if (check[grid[row][col]-1] != false)
			{
			   return "Puzzle not VALID - problem with northeast window";
			}
			check[grid[row][col]-1] = true;
		    }
		}

		// check window3
		System.out.println("Checking southwest window");
		resetCheckVector();
		for (int row=5; row<8; row++)
		{
		    for (int col=1; col<4; col++)
		    {
			//System.out.println("Grid value is: "+ grid[row][col]);
			if (check[grid[row][col]-1] != false)
			{
			   return "Puzzle not VALID - problem with southwest window";
			}
			check[grid[row][col]-1] = true;
		    }
		}

		// check window4
		System.out.println("Checking southeast window");
		resetCheckVector();
		for (int row=5; row<8; row++)
		{
		    for (int col=5; col<8; col++)
		    {
			//System.out.println("Grid value is: "+ grid[row][col]);
			if (check[grid[row][col]-1] != false)
			{
			   return "Puzzle not VALID - problem with southeast window";
			}
			check[grid[row][col]-1] = true;
		    }
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
