package nyTimesSpellingBee;

/*
 * There is a very popular online game called Spelling Bee that is available on the 
 * New York Times website. (www.nytimes.com/puzzles/spelling-bee). For those of you
 * in CS476, this was the program that our guest Mberry Seck talked about.
 * 
 * The puzzle is that you are provided with 7 unique letters, one of which is mandatory.
 * You must then find as many words as possible using only the 7 letters.  You may
 * repeat letters, you may leave letters out, but you MUST use the mandatory letter in
 * every word. Words must be at least 4 letters long. Four letter words are worth 1 point
 * all other words are worth points equal to the number of letters in the word. 
 * (BEACH would be worth 5 pts. INDIFFERENT would be worth 11 pts.)
 * 
 * This program uses the website https://api.dictionaryapi.dev/api/v2/entries/en_US/ to 
 * verify that actual English words have been found. Append any string to this URL and
 * if the string is an English word, a connection can be made to the website. If it 
 * is not a word, then no connection can be made. This program uses that feature to 
 * determine if a string found is an English word. The program also verifies that the
 * word is at least 4 characters, has not already been found, and that it is in the
 * puzzle.
 * 
 * This is a uninspired implementation of the program. There is a single class with
 * everything shoved into the runCode() method. The all-important generate puzzle 
 * method has been left unimplemented and instead simply returns a default puzzle 
 * (it happens to be the very first puzzle posted to the NY TIMES site.) There is a 
 * description of the algorithm necessary to successfully implement this method.
 * 
 * As you look at this program, think about ways that design patterns could improve
 * it. Think about how future extensions to the puzzle could be made easier with
 * design patterns inserted into the design of the program. There WILL be questions
 * on the final exam related to this program.
 * 
 * Author: D. Palmer 	Date: May 9-11, 2021
 */

import java.util.ArrayList;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Driver {

	ArrayList<String> foundWords = new ArrayList<String>();
	String puzzle;
	
	public static void main(String[] args)  
	{  
		new Driver().runCode();
	}  

	public void runCode()
	{
		String userWord;
		int totalScore = 0, points;
		puzzle = generatePuzzle();
		
		System.out.println(puzzle);
		Scanner in = new Scanner(System.in);

		while (0 != 1)
		{
			System.out.println("\n>"+puzzle.charAt(0)+"< "+puzzle.substring(1));
			System.out.println("Enter a string: ");
			userWord = in.next().toUpperCase();

			if (checkIfValid(userWord))
			{
				foundWords.add(userWord);
				points = calculatePoints(userWord);
				System.out.println(""+userWord.toUpperCase()+" Score: "+ points);
				totalScore += points;
				System.out.println("Total Score so far: "+ totalScore);
			}
		}
	}
	
	private String generatePuzzle()
	{
		char[] vowels =     {'a', 'e', 'i', 'o', 'u'};
		char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p',
				             'q','r','s','t','v','w','x','y','z'};
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				           'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] difficult = {'j', 'q', 'x', 'z'};
		String puzzle = "";
		
		// To generate a workable puzzle, certain criteria must be met. 
		// Needs to be at least TWO VOWELS
		// Needs to be at least FOUR CONSONANTS
		// Needs to have one REQUIRED letter that can be a VOWEL or CONSONANT
		// Cannot have more than one difficult letter
		// If there is a Q, there MUST be a U
		
		// This method has NOT BEEN implemented, instead the current version returns the
		// puzzle below. The first letter in the String is the required letter, in this 
		// case, 'W'.
		
		// As you are looking this program over, think about how you might implement
		// this method.
		
		return "WAHORTY";
	}

	private boolean checkIfValid(String word)
	{
		if ( atLeastFourLetters(word) &&
				checkIfWord(word) &&
				checkIfInPuzzle(word) &&
				!checkIfAlreadyFound(word))
		{
			System.out.println("Word " + word + " is accepted!");
			return true;
		}
		System.out.println("" + word + " is rejected");
		return false;
	}
	
	private boolean checkIfWord(String word)  
	{  
		boolean result = true;

		String theURL = "https://api.dictionaryapi.dev/api/v2/entries/en_US/" + word;
		try  
		{  
			URL url = new URL(theURL); // creating a url object  
			URLConnection urlConnection = url.openConnection(); // creating a urlconnection object 
			urlConnection.getInputStream();
		}  
		catch(Exception e)  
		{  
			System.out.println(""+ word + " is not a word");
			result = false;  
		}  
		return result;  
	} 
	
	private boolean checkIfInPuzzle(String word)
	{
		// check to see if the required letter is in the user word
		// check if all letters in user word are in the puzzle letters
		CharSequence letter = ""+puzzle.charAt(0);
		
		if (word.contains(letter))
		{
			// check for other letters
			for (int index=0; index<word.length(); index++)
			{
				letter = ""+word.charAt(index);
				if (!puzzle.contains(letter))
				{
					System.out.println("The word must be made up entirely of letters in the puzzle: " + letter + " is not there");
					return false;
				}
			}
			return true;
		}
		else
		{
			System.out.println("Words must contain the letter: "+ puzzle.charAt(0));
			return false;
		}
		
	}
	
	private boolean checkIfAlreadyFound(String word)
	{
		boolean found = foundWords.contains(word);
		if (found)
		{
			System.out.println("You already found that word!");
		}
		return found;
	}
	
	private boolean atLeastFourLetters(String word)
	{
		if (word.length()<4) System.out.println("Must be at least 4 characters long");
		return word.length() >= 4;
	}
	
	private int calculatePoints(String word)
	{
		int score;
		
		if (word.length() == 4)
		{
			score = 1;
		}
		else
		{
			score = word.length();
		}
		return score;
	}
}  
