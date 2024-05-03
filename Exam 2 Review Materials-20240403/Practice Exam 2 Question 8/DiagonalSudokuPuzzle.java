package puzzlerChecker;

public class DiagonalSudokuPuzzle extends Puzzle {

	
	// diagonal sudoku - correct
	private int[][] grid = { 	{1,6,9,8,4,3,5,7,2},
								{4,3,8,2,7,5,6,1,9},
								{5,7,2,9,1,6,4,3,8},
								{9,8,1,4,6,7,2,5,3},
								{6,4,3,1,5,2,8,9,7},
								{2,5,7,3,8,9,1,6,4},
								{3,2,6,5,9,8,7,4,1},
								{7,9,4,6,2,1,3,8,5},
								{8,1,5,7,3,4,9,2,6} };
	/*
	// diagonal sudoku - incorrect
	private int[][] grid = {  	{6,1,8,5,3,4,7,9,2},
								{9,4,7,6,1,2,8,3,5},
								{3,5,2,9,8,7,1,4,6},
								{1,7,4,3,5,6,9,2,8},
								{2,3,9,8,7,1,6,5,4},
								{8,6,5,4,2,9,3,1,7},
								{4,8,1,2,6,3,5,7,9},
								{7,9,6,1,4,5,2,8,3},
								{5,2,3,7,9,8,4,6,1} };
	*/
	
	public SudokuPuzzleChecker getPuzzleChecker()
	{
		return new DiagonalSudokuChecker(grid);
	}

}
