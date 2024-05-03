package puzzlerChecker;

/*
 * This is the concrete child class to check hidden message word puzzles. 
 * 
 * Author: D. Palmer	Date: 2018
 * 
 * Modified: April 11, 2021 fixed bugs, added display functionality
 */

public class HiddenMessageChecker extends WordPuzzleChecker {

	private char[] foundMessage = new char[74];
	private String leftoverMessage;

	public HiddenMessageChecker(char[][] grid, String[] wordList, String left)
	{
		original = grid;
		numRows = grid.length;
		numCols =grid[0].length;
		this.wordList = wordList;
		leftoverMessage = left;
		
		// Allows searching in eight directions
		rOffset = new int[8];
		rOffset[0] = -1;
		rOffset[1] = 0;
		rOffset[2] = 1;
		rOffset[3] = 0;
		rOffset[4] = 1;
		rOffset[5] = 1;
		rOffset[6] = -1;
		rOffset[7] = -1;
		
		cOffset = new int[8];
		cOffset[0] = 0;
		cOffset[1] = 1;
		cOffset[2] = 0;
		cOffset[3] = -1;
		cOffset[4] = 1;
		cOffset[5] = -1;
		cOffset[6] = 1;
		cOffset[7] = -1;
		
		remaining = new char[numRows][numCols];

		copyLetterGrid(remaining, original);
		printLetterGrid(remaining);
		System.out.println(" ");
	}
	
	// The replacement character is a SPACE
	public char replaceChar(char ch)
	{
		return ' ';
	}

	public String checkPuzzleValid()
	{
		// in order to have a valid puzzle, all words in the
		// word list must be in the letter grid
		for (int index=0; index<wordList.length; index++)
		{
			// if one is not, the puzzle is invalid
			if (!findWords(wordList[index]))
			{
				return "Not all words found in puzzle! INVALID";
			}
			System.out.println("\n");
		}

		// collect remaining letters after all words have been found
		int fIndex = 0;

		for (int row=0; row<numRows; row++)
		{
			for (int col=0; col<numCols; col++)
			{
				if (remaining[row][col] != ' ')
				{
					foundMessage[fIndex++] = remaining[row][col];
				}
			}
		}

		// match hidden message to given hidden message
		String found = new String(foundMessage);

		System.out.println("Message found in remaining letters:");
		System.out.println(found+"\n");

		// In order for the puzzle to be valid, the remaining letters must
		// spell out the expected message in order.
		if (leftoverMessage.equals(found))
		{
			return("Hidden message word puzzle successfully verified!");
		}
		else
		{
			return("Hidden message word puzzle NOT valid!");
		}
	}
}