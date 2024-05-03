package NumbleProgram;

/*
 *  This class in the Numble program generates a random
 *  solution and allows the user to check their guess 
 *  against the solution to see if they have solved
 *  the puzzle
 *  
 *  Author: D. Palmer
 *  
 *  Date: February 3, 2022
 */

public class SolutionChecker {

	int[] puzzle = new int[4];
	boolean[] used = new boolean[10];
	
	// Generates a four digit secret code with no duplicates
	// using the numbers 1-9,
	public void initialize()
	{
		for (int count=0; count<4; count++) 
		{
			int temp;
			
			temp = (int)(Math.random()*9)+1;
			while (used[temp])
			{
				temp = (int)(Math.random()*9)+1;
			}
			puzzle[count]=temp;
			used[temp] = true;
		}
	}
	
	// Returns TRUE if the passed in guess matches the puzzle
	// FALSE otherwise
	public boolean check(int[] guess)
	{
		return guess[0] == puzzle[0] && 
				guess[1] == puzzle[1] &&
				guess[2] == puzzle[2] &&
				guess[3] == puzzle[3];
	}
	
	// Sends the solution to the caller
	public int[] getSolution()
	{
		return puzzle;
	}
}
