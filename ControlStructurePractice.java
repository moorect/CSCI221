/**
 * This class contains 8 looping/branching structures for practice
 * @author Chris Moore
 * @since September 14, 2012
 * @status The program works as intended
 */
package practice;
public class ControlStructurePractice {

	/**
	 * @param args
	 * @return null, this method does not return a value
	 */
	public static void main(String[] args)	{
		//Part 1: A for loop that adds the ints from 1-100 and prints result
		int sum = 0; int i = 1;
		for (i = 1; i <= 100; i++)	{
			sum += i;
			}
		System.out.println("Part 1 Result: " + sum);
		
		//Part 2: A while loop that adds the ints from 1-100 and prints the result
		sum = 0; i = 1;
		while (i <= 100)	{
			sum += i;
			i++;
			}
		System.out.println("Part 2 Result: " + sum);
		
		//Part 3: A do loop that adds the ints from 1-100 and prints the result
		sum = 0; i = 1;
		do	{
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println("Part 3 Result: " + sum);
		
		//Part 4: An infinite while loop that uses break to exit that adds the ints from 1-100 and prints the result
		sum = 0; i = 1;
		while (i > 0)	{
			sum += i;
			i++;
			if (i > 100)
				break;
		}
		System.out.println("Part 4 Result: " +  sum);
		
		//Part 5: A for loop that iterates from 1-100 using a continue statement and adds the odd ints and I'm assuming you want the result printed 
		sum = 0;
		for (i = 1; i <= 100; i++)	{
			System.out.print(i + ",");
			if (i % 2 == 0)	{
				continue;
			}
			sum += i;
		}
		System.out.println("\nPart 5 Result: " + sum);
		
		//Part 6: A nested if statement that prints the day of the week according to the int value from 1-7 (int value 1 used by default)
		int dayOfWeek = 1;
		System.out.print("Part 6 Result (int value is " + dayOfWeek +  "): ");
		if (dayOfWeek == 1)	{
			System.out.println("Sunday");
		}
		else if (dayOfWeek == 2)	{
			System.out.println("Monday");
		}
		else if (dayOfWeek == 3)	{
			System.out.println("Tuesday");
		}
		else if (dayOfWeek == 4)	{
			System.out.println("Wednesday");
		}
		else if (dayOfWeek == 5)	{
			System.out.println("Thursday");
		}
		else if (dayOfWeek == 6)	{
			System.out.println("Friday");
		}
		else if (dayOfWeek == 7)	{
			System.out.println("Saturday");
		}
		
		//Part 7: A switch statement that prints the day of the week according to the int value from 1-7 (int value 2 used by default)
		dayOfWeek = 2;
		System.out.print("Part 7 Result (int value is " + dayOfWeek +  "): ");
		switch (dayOfWeek)	{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}
		
		//Part 8: A conversion of a compound Boolean conditional into a nested if statement which prints "You win!" if true
		i = 2; int j = 11; int k = 5;
		System.out.print("Part 8 Result: ");
		if (i > 1)  {
			if (j >= 10)  {
				if (k == 5)  {
					System.out.println("You win!");
			}
		}
	}
	}
}
