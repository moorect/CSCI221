/**
 /* This class calculates and displays the cost of coffee orders
 * @author Chris Moore
 * @since September 6, 2012
 * @status The program works as intended
 */
import java.util.Scanner;
public class JavaJoe	{
	/**
	 * @param args
	 * @return null, this method does not return a value
	 */
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of bags of coffee in the order:");
		double bagPrice = 5.50;
		int numberOfBags = input.nextInt();
		int numberOfLargeBoxes = (int) numberOfBags / 20;
		int remainingBags = numberOfBags % 20;
		int numberOfMediumBoxes = 0;
		int numberOfSmallBoxes = 0;
		if (remainingBags >= 16) {
			numberOfMediumBoxes = 2;
			}
		else if (remainingBags < 16 && remainingBags >= 11) {
			numberOfMediumBoxes = 1;
			numberOfSmallBoxes = 1;
			}
		else if (remainingBags < 11 && remainingBags >= 6) {
			numberOfMediumBoxes = 1;
			}
		else if (remainingBags < 6 && remainingBags >= 1) {
			numberOfSmallBoxes = 1;
			}
		double preDiscountPrice = bagPrice * numberOfBags;
		System.out.print("\nNumber of Bags ordered:  " + numberOfBags);
		System.out.printf("  -  $%.2f", preDiscountPrice);
		double largeBoxCost = numberOfLargeBoxes * 2.00;
		double mediumBoxCost = numberOfMediumBoxes * 1.00;	
		double smallBoxCost = numberOfSmallBoxes * 0.50;
		double additionalBoxCost = largeBoxCost + mediumBoxCost + smallBoxCost;
		if (numberOfLargeBoxes > 0) {
			System.out.printf("\nLarge boxes:              " + numberOfLargeBoxes + "  -  $%.2f", largeBoxCost);
		}
		if (numberOfMediumBoxes > 0) {
			System.out.printf("\nMedium boxes:             " + numberOfMediumBoxes + "  -  $%.2f", mediumBoxCost);
		}
		if (numberOfSmallBoxes > 0) {
			System.out.printf("\nSmall boxes:              " + numberOfSmallBoxes + "  -  $%.2f", smallBoxCost);
		}
		double discount = 0.0;
		if (numberOfBags >= 300) {
			discount = .30;
		}
		else if (numberOfBags >= 250) {
			discount = .25;
		}
		else if (numberOfBags >= 200) {
			discount = .20;
		}
		else if (numberOfBags >= 100) {
			discount = .15;
		}
		else if (numberOfBags >= 50) {
			discount = .10;
		}
		else if (numberOfBags >= 25) {
			discount = .05;
		}
		double postDiscountPrice = preDiscountPrice - (preDiscountPrice * discount);
		System.out.print("\nDiscount:                " + (int)(discount * 100) + "%  -  ");
		System.out.printf("($%.2f)", (preDiscountPrice * discount));
		System.out.printf("\n\nTotal Cost:                     $%.2f", (postDiscountPrice + additionalBoxCost));
	}
}