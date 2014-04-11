/**
 * This class finds the longest word in the text entered and displays its position
 * @author Chris Moore
 * @since August 29, 2012
 * @status The program works as intended
 */
import java.util.Scanner;
public class LongestWord
{
	/**
	 * @param args
	 * @return null, this method does not return a value
	 */
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int counter = 1, longestLen = 0, longestPos = 1;
		String longestWord = "";
		System.out.println("Enter words: ('ENDINPUT' to stop)");
		String userInput = scannerObject.next();
		//System.out.println("TEST: " + userInput);
		//userInput = scannerObject.next();
		//System.out.println("TEST: " + userInput);
		while (!userInput.equals("ENDINPUT"))
		{		
			if (userInput.length() > longestLen)
			{
				longestLen = userInput.length();
				longestWord = userInput;
				longestPos = counter;
			}
			counter += 1;
			//System.out.println("TEST: " + userInput);
			userInput = scannerObject.next();
		}
		//if (userInput == "ENDINPUT")
			System.out.println("\nThe longest word is " + longestWord + ".");
			System.out.println("Word position is " + longestPos + ".");
	}

}
