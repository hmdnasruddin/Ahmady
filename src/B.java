import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
	
		/*
		 * 1. Write a program that reads a range
		 * of integers (start and end point), provided by a user and then from that
		 * range prints the sum of the even and odd integers. 
		 * 2. Ask user to enter the
		 * item they want to buy and the price for the item. Then ask user to pay for
		 * it. Every time user enters money accumulate the amount and tell user how much
		 * is left to pay off the amount. Whenever user done with payments tell them
		 * "Thank you for shopping!" 
		 * print the following pattern: 1 12 123 1234 12345 4.
		 * Print the following pattern:
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 * 5. Write a guessing game where the user has to guess a secret number between
		 * 1 and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!". 
		 * 
		 * 6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap
		 * year. As soon as the user enters the correct leap year exit the loop.
		 */
		for(int i=1; i<=5; i++) {
			for(int y=1; y<= 2; y++) {
				if(i == 1 || i <= 5 || y == 1 || y == 2) {
					System.out.print("*");
				}else {
					System.out.println("*");
				}
			}
		System.out.println();
		}
	}
}
