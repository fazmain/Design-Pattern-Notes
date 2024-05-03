package puzzlerChecker;

/*
 *  This class hardcodes a specific scrambled hidden message word puzzle. As one finds the words
 *  in the puzzle, cross out the letters of those words. When finished, the uncrossed 
 *  letters can be unscrambled to form a word. This checker verifies that the expected 
 *  hidden word can be formed by the remaining letters after all the words have been crossed out.
 *  
 *  In actual practice, this class would access a collection of puzzles from a database
 *  of scrambled hidden message word puzzles and can create and check each one.
 *  A team of puzzle developers would create new puzzles and put them in the database
 *  the program could then pull the unchecked ones and perform the verification, inserting
 *  the validation into the database.
 *  
 *  Author: D. Palmer	Date: April 11, 2021 (This was part of the original Driver class)
 */

public class ScrambledHiddenMessagePuzzle extends WordPuzzle {

    // Hard word find puzzle: 14x16 grid, 40 words, up to 12 letters long, 18-letter hidden scrambled word
    private char[][] letterGrid = 
    	{ 		{'H','D','E','Y','A','S','S','E','S','C','T','S','M','I','S','Y'},
    			{'S','B','I','C','Y','C','L','E','D','H','E','E','R','F','P','K'},		
    			{'O','T','Y','A','O','D','E','C','E','I','T','S','E','G','U','C'},
    			{'G','S','R','R','U','I','A','N','F','N','C','S','L','R','R','U'},
    			{'E','O','R','U','T','S','C','I','O','N','O','U','A','E','E','M'},
    			{'M','M','A','D','H','E','T','A','I','I','R','P','T','Y','T','S'},
    			{'T','N','M','B','F','L','S','Z','P','J','D','O','I','H','A','S'},
    			{'U','R','T','O','U','I','J','O','L','T','E','D','V','O','L','E'},
    			{'N','E','R','T','L','S','R','A','P','D','A','I','I','U','I','N'},
    			{'L','T','S','E','N','D','E','D','I','E','L','Y','S','N','A','P'},
    			{'H','S','P','E','E','K','E','D','D','F','B','Y','T','D','T','M'},
    			{'M','A','G','I','S','T','E','R','I','A','L','E','I','S','I','A'},
    			{'S','E','D','I','S','A','S','M','O','C','K','A','C','N','N','D'},
    			{'S','P','M','O','R','T','E','V','T','E','O','N','Y','K','G','R'} };
    
	private String[] wordList =
			{	"ABUSED", "ACTS", "ASIDES", "BECK", "BICYCLED", "DAMPNESS", "DECEITS", "DEFACE",
				"EASTERNMOST", "ENDED", "ESSAYED", "FLAY", "GOSH", "GREYHOUNDS", "IDIOT", "JINNI",
				"JOLTED", "LYING", "MAGISTERIAL", "MARRY", "MORAYS", "MUCKY", "NUTMEG", "OBDURACY",
				"ORDEAL", "PANSY", "PARS", "PEEKED", "PUSSES", "RELATIVISTIC", "RETALIATING", "SCION",
				"SMOCK", "SPUR", "STULTIFIES", "THENCEFORTH", "TROMPS", "VOLE", "YOUTHFULNESS", "ZINCS" };
	
    private String scrambledWord = "OVERSIMPLIFICATION";
    
	public WordPuzzleChecker getPuzzleChecker()
	{
		return new ScrambledHiddenMessageChecker(letterGrid, wordList, scrambledWord);
	}
}
