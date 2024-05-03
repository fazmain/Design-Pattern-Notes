package puzzlerChecker;

/*
 * This is the concrete child class to check simple word puzzles. 
 * 
 * Author: D. Palmer	Date: 2018
 * 
 * Modified: April 11, 2021 fixed bugs, added display functionality
 */

public class SimpleWordChecker extends WordPuzzleChecker {

	public SimpleWordChecker(char[][] grid, String[] wordList)
	{
		original = grid;
		numRows = grid.length;
		numCols =grid[0].length;
		this.wordList = wordList;
		
		// Customizes the directions to search for words. In the simple
		// puzzle no diagonals are allowed (1, 0) means search in the
		// forward, horizontal direction, (0, -1) means search in the 
		// downward, vertical direction
		// 
		rOffset = new int[4];
		rOffset[0] = -1;
		rOffset[1] = 0;
		rOffset[2] = 1;
		rOffset[3] = 0;
		
		cOffset = new int[4];
		cOffset[0] = 0;
		cOffset[1] = 1;
		cOffset[2] = 0;
		cOffset[3] = -1;

		remaining = new char[numRows][numCols];

		copyLetterGrid(remaining, original);
		printLetterGrid(remaining);
		System.out.println(" ");
	}
	
	// This method replaces uppercase letters in the puzzle
	// with the corresponding lowercase letter to highlight
	// where the word was found.
	public char replaceChar(char ch)
	{
		return Character.toLowerCase(ch);
	}

	// For a simple word puzzle, if all the words in the 
	// word list are found, then the puzzle is valid.
	public String checkPuzzleValid()
	{
		// find and eliminate all words
		for (int index=0; index<wordList.length; index++)
		{
			if (!findWords(wordList[index]))
			{
				return "Word from word list not found - puzzle INVALID!";
			}
			System.out.println("\n");
		}
		return "All words from word list found - puzzle VALID!";
	}
}
