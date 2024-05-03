package puzzlerChecker;

/*
 * This is the abstract parent class of all puzzle checkers. It requires the subclasses
 * to write specific methods for checkPuzzleValid() and repalceChar(). The first of these
 * handles any special components such as hidden messages or scrambled words. The second
 * customizes the way the puzzle is displayed as is being solved.
 * 
 * There is also the method that does the heavy lifting for the word search puzzles that finds
 * the words. This method simply returns TRUE or FALSE depending on whether the word is found
 * in the puzzle using the techniques allowed for that type of puzzle.
 * 
 * Author: D. Palmer	Date: 2018
 * 
 * Modified: April 11, 2021 combined and moved into parent class, fixed bugs
 */

public abstract class WordPuzzleChecker extends PuzzleChecker{
	protected char[][] original, remaining;
	protected int numRows, numCols;
	protected String[] wordList;
	protected int[] rOffset, cOffset;

    public abstract String checkPuzzleValid();
    public abstract char replaceChar(char ch);
    
	final protected boolean findWords(String s)
	{
		int pos;
		char[][] tempGrid = new char[numRows][numCols];
		char[][] savedGrid = new char[numRows][numCols];
		boolean done = false;

		System.out.println("Trying to find: " + s);
		copyLetterGrid(tempGrid, remaining);
		copyLetterGrid(savedGrid, remaining);

		// Go through every row looking for the starting letter of the word.
		for (int row=0; row<numRows; row++)
		{
			// Go through every column looking for the starting letter of the word.
			for (int col=0; col<numCols; col++)
			{
				// if the starting letter is found...
				if (s.charAt(0) == original[row][col]) 
				{
					// ... look in each direction for the rest of the letters
					for (int dir=0; dir<rOffset.length; dir++)
					{
						pos = 1;
						done = false;
						// check the entire length of the word for matching letters in the puzzle
						while (pos < s.length() && !done) 
						{
							// indicates in the printed puzzle where the word was located
							tempGrid[row][col] = replaceChar(s.charAt(0));
							
							// complex conditional here makes sure that the word is not searched for off
							// the grid, and that the subsequent letters in the word, match the subsequent
							// letters in the puzzle
							if (row+pos*rOffset[dir] >= 0 && 
									row+pos*rOffset[dir] < original.length &&
									col+pos*cOffset[dir] >= 0 &&
									col+pos*cOffset[dir] < original[0].length &&
									s.charAt(pos) == original[row+pos*rOffset[dir]]
											[col+pos*cOffset[dir]])
							{
								tempGrid[row+(pos*rOffset[dir])][col+(pos*cOffset[dir])] = replaceChar(s.charAt(pos)); 
								pos++;
							}
							else // if the search goes off the edge, or finds a mismatched letter, stop searching
							{
								done = true;
							}
						}

						// if it was unsuccessful - the whole word was not found, reset the puzzle
						if (done == true)
						{
							copyLetterGrid(tempGrid, savedGrid);
						}
						else // if it was successful, updated the remaining letters in the puzzle
						{
							System.out.println("FOUND "+s);
							printLetterGrid(tempGrid);
							copyLetterGrid(remaining, tempGrid);
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	// Displays the whole word grid puzzle 
	protected void printLetterGrid(char[][] source)
	{
		for (int row=0; row < numRows; row++)
		{
			for (int col=0; col < numCols; col++)
			{
				System.out.print(source[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	// Copies the letter grid to another location
	protected void copyLetterGrid(char[][] dest, char[][] source)
	{
		for (int row=0; row < numRows; row++)
		{
			for (int col=0; col < numCols; col++)
			{
				dest[row][col] = source[row][col];
			}
		}
	}
}
