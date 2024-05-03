package puzzlerChecker;

public class WordPuzzleMaker extends PuzzleMaker {

	public Puzzle getPuzzle(int pType)
	{
		if (pType == 0)
		{
			return new SimpleWordPuzzle();
		}
		if (pType == 1)
		{
			return new HiddenMessagePuzzle();
		}
		// else 
		return new ScrambledHiddenMessagePuzzle();
	}
}
