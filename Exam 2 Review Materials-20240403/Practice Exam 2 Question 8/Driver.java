package puzzlerChecker;

import java.util.Scanner;

/*
 *  This program demonstrates generates three 
 *  
 *  The program also uses the Factory Method DP to obtain the appropriate object in a 
 *  parallel hierarchy (like in the Pet-PetSitter example).  Each subclass of Puzzle
 *  has a getPuzzleChecker() method which returns an object of the correct subclass of 
 *  the PuzzleChecker class. When the getPuzzleChecker() method of an object of type 
 *  SimpleWordPuzzle is invoked, it returns an object of type SimpleWordChecker that 
 *  is designed to check SimpleWordPuzzles. (and so on). The Driver program, not knowing
 *  which type of puzzle it has, invokes the getPuzzleChecker(), and does not know what
 *  type of PuzzleChecker it receives. The beauty of the Factory Method DP is that they
 *  will match.
 *  
 *  Author: D. Palmer			Date: 2018
 *  
 *  Modified: April 11, 2021	Redesigned to show both types of Factory Method usage, fixed bugs
 */

public class Driver {

	Puzzle puzzle;
	PuzzleFactory puzzleFactory;
	PuzzleMaker puzzleMaker;
	PuzzleChecker puzzleChecker;
	
	int puzzleType, puzzleDifficulty;
	
    public static void main(String args[])
    {
    	new Driver().runCode();
    }
    
    public void runCode()
    {
    	puzzleFactory = new PuzzleFactory();
    	PuzzleMaker puzzleMaker;
    	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the kind of puzzle to check: 0=find-a-word, 1=sudoku, 2=crossword (not implemented)");
		puzzleType = in.nextInt();
		puzzleMaker = puzzleFactory.getPuzzleMaker(puzzleType);
		
		System.out.println("Enter the type of puzzle to check: 0=easy, 1=medium, 2=hard");
		puzzleDifficulty = in.nextInt();
		in.close();

    	puzzle = puzzleMaker.getPuzzle(puzzleDifficulty); 
    	puzzleChecker = puzzle.getPuzzleChecker();
    	System.out.println(puzzleChecker.checkPuzzleValid());
    }
}
