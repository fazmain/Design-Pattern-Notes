package puzzlerChecker;

public class PuzzleFactory {

	public PuzzleMaker getPuzzleMaker(int pfType)
	{
		if (pfType == 0)
		{
			return new WordPuzzleMaker();
		}
		if (pfType == 1)
		{
			return new SudokuPuzzleMaker();
		}
		// else 
		return new CrossWordPuzzleMaker();
	}
}
