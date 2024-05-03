package puzzlerChecker;

public class SimpleSudokuChecker extends SudokuPuzzleChecker{


	//private int[][] grid;
	private boolean check[] = new boolean[9];

	public SimpleSudokuChecker(int[][] grid)
	{
		this.grid = grid;
	}
	
	public String checkPuzzleValid()
	{
		displayGrid();
		// check rows
		for (int row=0; row<9; row++)
		{
			System.out.println("Checking row# " + (row+1));
			resetCheckVector();
			for (int col=0; col<9; col++)
			{
				//System.out.println("Grid value is: "+ grid[row][col]);
				if (check[grid[row][col]-1] != false)
				{
					return "Puzzle not VALID, problem with ROWS";
				}
				check[grid[row][col]-1] = true;
			}
		}
		System.out.println("Completed checking rows");

		// check columns
		for (int col=0; col<9; col++)
		{
			System.out.println("Checking col# " + (col+1));
			resetCheckVector();
			for (int row=0; row<9; row++)
			{

				//System.out.println("Grid value is: "+ grid[row][col]);
				if (check[grid[row][col]-1] != false)
				{
					return "Puzzle not VALID, problem with COLUMNS";
				}
				check[grid[row][col]-1] = true;
			}
		}
		System.out.println("Completed checking columns");
		
		// check subgrids

		for (int row=0; row<9; row+=3)
		{
			for (int col=0;col<9;col+=3)
			{
				System.out.println("Checking subgrid: "+row+" "+col);
				resetCheckVector();
				for (int r=row; r<row+3; r++)
				{
					for (int c=col; c<col+3; c++)
					{
						//System.out.println("Grid value is: "+ grid[r][c]);
						if (check[grid[r][c]-1] != false)
						{
							return "Puzzle Not VALID, problem with SUB-GRIDS";
						}
						check[grid[r][c]-1] = true;
						
					}
				}
			}
		}
		System.out.println("Completed checking subgrids");
		
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
