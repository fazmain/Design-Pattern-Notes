package NumbleProgram;

/*
 * This class is part of the Numble game. It generates informational clues
 * to help the user guess the correct number sequence. It informs the user
 * when they have guessed the right number in the right position, and when
 * they have a correct number, but in the wrong position.
 * 
 * Author: D. Palmer
 * 
 * Date: February 3, 2022
 * 
 */

public class ClueGenerator {

	// Produces the right-number-right-position clues and the 
	// right-number-wrong-position clues based on the current 
	// guess and the correct answer
	public void generateClues(int[] guess, int[] solution)
	{
		// Detects and reports the right digit in the right position
		for (int count=0; count<4; count++)
		{
			if (guess[count] == solution[count])
			{
				System.out.print(guess[count]+" ");
			}
			else
			{
				System.out.print("_ ");
			}
		}
		System.out.println();
		
		// Detects and reports the right digit in the wrong position
		for (int count=0; count<4; count++)
		{
			for (int index=0; index<4; index++)
			{
				if (count != index && guess[count] == solution[index])
				{
					System.out.println(""+guess[count] +" is in the solution in a different position");
				}
			}
		}
		System.out.println();
	}
}
