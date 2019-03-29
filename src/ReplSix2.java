import java.util.Scanner;

public class ReplSix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubCreate a program that prompt user with question:  Do you need a loan?
		/*
		 * If the result is true then prompt user with question: What is your credit
		 * score? Otherwise eligibility = "Unknown" Based on the score define users
		 * eligibility if score is below 600 --> eligibility = "Not eligible" if score
		 * is between 600 and 700 inclusive --> eligibility = "Maybe eligible" if score
		 * is between 701 and 800 inclusive --> eligibility = "Eligible" if score is
		 * higher than any other previous values --> eligibility = "Definitely eligible"
		 * .
		 * 
		 * The output of the program should be: "The eligibility is ____"
		 */
       
       
		   boolean loan;
	       int creditscore;
	       String eligibility="";
	       Scanner scan=new Scanner(System.in);
			System.out.println("Do you need a loan?");
			loan=scan.nextBoolean();
			if (loan) {
			System.out.println("What is your credit score?");
			creditscore=scan.nextInt();
			
			if (creditscore<=600) {
				System.out.println("The eligibility is not eligible");
			}else if(creditscore >= 600 && creditscore <=700) {
				System.out.println("The eligibility is Maybe eligible");
			}else if (creditscore >=701 && creditscore <=800) {
				System.out.println("The eligibility is eligible");
			}else if (creditscore >  800) {
				System.out.println("The eligibility is Definitely Eligible ");
			}}else {
				System.out.println("The eligibility is Unknown");
			} 
	      }	
	    }	
		
	
 