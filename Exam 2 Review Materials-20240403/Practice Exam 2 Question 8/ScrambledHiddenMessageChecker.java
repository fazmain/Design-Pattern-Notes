package puzzlerChecker;

import java.util.Arrays;

/*
 * This is the concrete child class to check scrambled hidden message word puzzles. 
 * 
 * Author: D. Palmer	Date: 2018
 * 
 * Modified: April 11, 2021 Implemented actual scramble testing. Now the letters can
 * 							be in any order and correctly detected.
 */


public class ScrambledHiddenMessageChecker extends WordPuzzleChecker {
	private char[] foundMessage = new char[74];
	private String leftoverMessage;

	public ScrambledHiddenMessageChecker(char[][] grid, String[] wordList, String left)
	{
		original = grid;
		numRows = grid.length;
		numCols =grid[0].length;
		this.wordList = wordList;
		leftoverMessage = left;
		
		// Search in 8 directions
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
	
	// Replace found letters with dots
	public char replaceChar(char ch)
	{
		return '.';
	}

	public String checkPuzzleValid()
	{
		// find and eliminate all words
		for (int index=0; index<wordList.length; index++)
		{
			findWords(wordList[index]);
			//printLetterGrid(remaining);
			System.out.println("\n");
		}

		// collect remaining letters
		int fIndex = 0;

		for (int row=0; row<numRows; row++)
		{
			for (int col=0; col<numCols; col++)
			{
				if (remaining[row][col] != '.')
				{
					foundMessage[fIndex++] = remaining[row][col];
				}
			}
		}

		// match hidden message to given hidden message
		String found = new String(foundMessage);

		if (lettersScrambled(found.trim(), leftoverMessage))
		{
			System.out.println("Remaining letters are: \t\t"+found.trim());
			System.out.println("Can be re-arranged to form: \t"+leftoverMessage);
			return("Scrambled hidden message word puzzle successfully verfied!");
		}
		else
		{
			return("Scrambled hidden message word puzzle NOT valid!");
		}
	}
	
	private boolean lettersScrambled(String st1, String st2)
	{
		// two strings cannot be anagrams if they are of different lengths
		if (st1.length() != st2.length())
		{
			System.out.println("Not same length!");
			return false;
		}
		
		return areAnagrams(st1, st2);
	}
	
	// returns TRUE if the two supplied strings are comprised of the same letters rearranged
	public boolean areAnagrams(String str1, String str2) {
	    char[] first = str1.toCharArray();
	    char[] second = str2.toCharArray();
	    
	    Arrays.sort(first);
	    Arrays.sort(second);

	    return Arrays.equals(first, second);
	}
}
