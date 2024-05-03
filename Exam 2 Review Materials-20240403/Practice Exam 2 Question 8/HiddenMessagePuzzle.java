package puzzlerChecker;

/*
 *  This class hardcodes a specific hidden message word puzzle. As one finds the words
 *  in the puzzle, cross out the letters of those words. When finished, the uncrossed 
 *  letters form a hidden message. This checker verifies that the expected hidden message
 *  is found after all the words have been crossed out.
 *  
 *  In actual practice, this class would access a collection of puzzles from a database
 *  of hidden message word puzzles and can create and check each one.
 *  A team of puzzle developers would create new puzzles and put them in the database
 *  the program could then pull the unchecked ones and perform the verification, inserting
 *  the validation into the database.
 *  
 *  Author: D. Palmer	Date: April 11, 2021 (This was part of the original Driver class)
 */

public class HiddenMessagePuzzle extends WordPuzzle {

    // Medium word find puzzle: 14x15 grid, 26 words up to 9 letters long, diagonals, revealed message
    private char[][] letterGrid = 
    			{ 		{'O','E','N','A','M','E','L','S','A','C','H','U','R','N','S'},
    			  		{'N','S','G','U','M','C','R','S','L','N','Y','U','N','C','M'},
    			  		{'S','N','O','M','F','O','R','A','L','R','I','T','A','A','B'},
    			  		{'E','O','L','E','C','H','A','Y','C','L','I','H','P','R','N'},
    			  		{'N','O','S','B','E','C','S','O','S','K','E','S','C','I','L'},
    			  		{'A','P','S','T','E','K','S','A','B','T','S','B','A','M','A'},
    			  		{'V','S','E','A','V','S','N','Y','M','L','A','L','T','S','N'},
    			  		{'I','Q','U','A','L','R','R','E','L','P','E','L','R','S','T'},
    			  		{'T','H','S','W','C','E','S','O','P','C','L','E','E','C','E'},
    			  		{'O','E','O','M','T','L','D','T','R','E','T','E','R','F','R'},
    			  		{'S','B','O','T','R','B','O','O','E','N','W','U','R','T','N'},
    			  		{'A','B','O','L','E','M','P','C','A','U','G','T','O','S','S'},
    			  		{'N','P','E','S','A','U','R','C','K','S','R','E','E','W','G'},
    			  		{'O','R','N','O','U','T','E','T','B','S','Y','C','H','R','U'},
    			  		{'A','R','D','U','S','D','E','T','R','I','V','E','T','S','J'} };	      
    
	private String[] wordList =
			{	"BASKETS", "BELLS", "BOWLS", "CHINA", "CHURNS", "CLOCKS", "CRUETS", "CRYSTAL", "DECANTERS",
				"DOLLS", "ENAMELS", "JUGS", "LANTERNS", "MAPS", "MUGS", "PEWTER", "PORCELAIN", "POTTERY", 
				"RACKS", "RUGS", "SAMPLERS", "SPOONS", "TRIVETS", "TUMBLERS", "VANES", "VASES"};
	
    private String hiddenMessage = "ONLYUNCOMFORTABLECHAIRSBECOMEANTIQUESTHECOMFORTABLEONESAREWORNOUTBYHARDUSE";

	public WordPuzzleChecker getPuzzleChecker()
	{
		return new HiddenMessageChecker(letterGrid, wordList, hiddenMessage);
	}
}
