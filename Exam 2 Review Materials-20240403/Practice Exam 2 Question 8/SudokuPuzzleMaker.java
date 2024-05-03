package puzzlerChecker;

public class SudokuPuzzleMaker extends PuzzleMaker {

	public Puzzle getPuzzle(int pType)
	{
		if (pType == 0)
		{
			return new SimpleSudokuPuzzle();
		}
		if (pType == 1)
		{
			return new DiagonalSudokuPuzzle();
		}
		// else 
		return new WindowSudokuPuzzle();
	}
}
