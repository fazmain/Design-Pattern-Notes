package puzzlerChecker;

/*
 *  This class hardcodes a specific simple word puzzle, but in actual practice, this 
 *  would access a database of simple word puzzles and can create and check each one.
 *  A team of puzzle developers would create new puzzles and put them in the database
 *  the program could then pull the unchecked ones and perform the verification, inserting
 *  the validation into the database.
 *  
 *  Author: D. Palmer	Date: April 11, 2021 (This was part of the original Driver class)
 */

public class SimpleWordPuzzle extends WordPuzzle {

    // Simple word find puzzle: 8x12 grid, 16 3-4 letter words, no diagonals, many unused letters
    private char[][] letterGrid = 
    	{  		{'J','L','I','B','P','N','Z','Q','O','A','J','D'},
				{'K','B','F','A','M','Z','S','B','E','A','R','O'},
				{'O','A','K','T','M','I','C','E','C','T','Q','G'},
				{'Y','L','L','S','H','O','E','D','A','O','G','U'},
				{'S','L','H','C','O','W','Z','B','T','Y','A','H'},
				{'M','H','A','N','D','S','A','O','I','S','L','A'},
				{'T','X','P','I','F','Y','P','Y','A','G','J','T'},
				{'E','Z','T','B','E','L','T','E','A','T','A','H'} };
    
	private String[] wordList =
		{	"BALL", "BAT", "BEAR", "BELT", "BOY", "CAT", "COW", "DOG", "EAT", "GAL",
			"HAND", "HAT", "MICE", "SHOE", "TOYS", "ZAP" };
	

	public WordPuzzleChecker getPuzzleChecker()
	{
		return new SimpleWordChecker(letterGrid, wordList);
	}
}
