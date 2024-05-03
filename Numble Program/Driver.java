package NumbleProgram;

/*
 *  The extremely popular word game Wordle is based on an earlier game
 *  called "Mastermind" which used colors instead of words. We are going
 *  to implement Numble, which will be similar to both games.
 *  
 *  This will be an intentional implementation to show how multiple
 *  classes can work together.
 *  
 *  Author: D. Palmer
 *  
 *  Date: February 3, 2022
 */

public class Driver {

	private int numGuesses=0;
	private int[] guess = new int[4];
	boolean solved = false;
	
	// These are two object variables to access other parts of the program
	private SolutionChecker solutionChecker;
	private ClueGenerator clueGenerator;
	private GuessGetter guessGetter;  // declare variable
	
	public static void main(String[] args)
	{
		new Driver().runCode();
	}
	
	public void runCode()
	{
		// Create the solution checker to compare guesses
		solutionChecker = new SolutionChecker();
		
		// Create the clueGenerator to give hints
		clueGenerator = new ClueGenerator();
		
		// Create the guessGetter to solicit user guess
		guessGetter = new GuessGetter();  // created the object 
		
		// Make the solution to the puzzle 
		solutionChecker.initialize();
		
		// Allow the user up to 5 guesses to solve the puzzle
		while (numGuesses < 5 && !solved)
		{
			// Get a guess from the user
			guess = guessGetter.getGuess();
			System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]);			numGuesses++;
			// Check if solved
			solved = solutionChecker.check(guess);
			// If not, generate clues for next guess
			if (!solved)
			{
				clueGenerator.generateClues(guess, solutionChecker.getSolution());
			}
		}
		
		// Display results
		if (solved)
		{
			System.out.println("You solved the puzzle in "+ numGuesses+" guesses!");
		}
		else
		{
			System.out.println("You did not guess the puzzle in 5 tries");
			System.out.println("The solution was: ");
			
			for (int index=0; index<4; index++)
			{
				System.out.print(solutionChecker.getSolution()[index]+" ");
			}
			System.out.println();
		}
	}
}
