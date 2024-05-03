package NumbleProgram;

import java.util.Scanner;

public class GuessGetter {

	private Scanner scan = new Scanner(System.in);
	
	// Gets a 4-digit integer guess from the user
	public int[] getGuess()
	{
		int num=0;  // local variable
		int[] guessArray = new int[4];
		boolean goodInput = false;

		// This loops makes sure the guess is legit (must be 4 digits)
		while (!goodInput)
		{
			System.out.println("Please enter a 4 digit integer guess");
			num = scan.nextInt();

			if (num<1000)
			{
				System.out.println("That integer is too short!");
			}
			
			else if (num > 9999)
			{
				System.out.println("That number is too long!");
			}
			else
			{
				goodInput = true;
			}
		}
		
		// Converts the 4-digit integer to 4 single-digit integers in the array
		guessArray[0] = num / 1000;
		num = num - guessArray[0] * 1000;
		
		guessArray[1] = num / 100;
		num = num - guessArray[1] * 100;
		
		guessArray[2] = num / 10;
		num = num - guessArray[2] * 10;
		
		guessArray[3] = num;
		
		return guessArray;
	}
}
