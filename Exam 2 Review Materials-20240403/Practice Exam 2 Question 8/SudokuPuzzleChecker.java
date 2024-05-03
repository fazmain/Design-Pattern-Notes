package puzzlerChecker;

public abstract class SudokuPuzzleChecker extends PuzzleChecker {

	public abstract String checkPuzzleValid();
	
	protected int[][] grid;
	
	protected void displayGrid()
	{
		for (int row=0; row<9; row++)
		{
			for (int col=0; col<9; col++)
			{
				System.out.print(grid[row][col]+" ");
			}
			System.out.println();
		}
	}
}
