/**
 * Program 1
 * It finds and outputs the longest word in the text entered from the console and the position 
 * of that word from the beginning of the text entered.
 * 
 * @author starr, chris
 * @since August 24, 2012
 * @status This program works as specified. It has been tested on multiple inputs of varying lengths.
 * This is my submission for Program 1. It works, or at least passes all of my test cases.
 */

import java.util.Scanner;

public class TextApp {

	/**
	* This method kicks off the application. It contains the logic of the application also
	* within the static method, main. 
	* @param args -- not used in to deliver input upon program launch
	* @return <what the method returns>
	*/
	public static void main(String[] args) {		
		// Set up the Scanner object to accept input from the keyboard
		Scanner myScanner = new Scanner(System.in);
		
		// Prompt the user to enter text followed by the special word that signals 
		// the end of the sequence of words from the keyboard.
		System.out.println("Enter text (a sequence of words) with the word ENDINPUT as the last word:");		
		
		String longestWord = "";
		int positionOfLongestWord = 0;
		int i = 0;
		
		while (!myScanner.hasNext("ENDINPUT"))
		{
			i++;
			String word = myScanner.next();
			// System.out.println("word = "+word); this was a debugging statement that I commented out after testing.
			if (word.length()>longestWord.length())
			{
				longestWord = word;
				positionOfLongestWord = i;
			}
			// System.out.println("position of longest is "+positionOfLongestWord); this was a debugging statement that I commented out after testing.
		}
		
		myScanner.close(); //this is not necessary, but a good practice
		
		System.out.println("The longest word is \'"+longestWord + "\'.");
		System.out.println("Word position " + positionOfLongestWord + ".");
	}

}
