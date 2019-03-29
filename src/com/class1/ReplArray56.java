package com.class1;

import java.util.Scanner;

public class ReplArray56 {

	public static void main(String[] args) {
		/*
		 * Note: Create a main Method, and also use a Scanner Class Write a program that
		 * creates an array of strings with the size being 7. Ask the user to input Days
		 * of a week beginning with Sunday. Add these inputs to your array and print the
		 * values using a for-each loop.
		 * Hint:
		 * Please enter day 1 of the week Sunday Please enter day 2 of the week Monday
		 * Please enter day 3 of the week Tuesday Please enter day 4 of the week
		 * Wednesday Please enter day 5 of the week Thursday Please enter day 6 of the
		 * week Friday Please enter day 7 of the week Saturday
		 */
	String weekdays;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter day 1 of the week");
	System.out.println("Please enter day 2 of the week");
	System.out.println("Please enter day 3 of the week");
	System.out.println("Please enter day 4 of the week");
	System.out.println("Please enter day 5 of the week");
	System.out.println("Please enter day 6 of the week");
	System.out.println("Please enter day 7 of the week");
	System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
	
	weekdays=scan.nextLine();
	String[]weekday= {"Sunday","Monday","Tuesday","Wednesday","Wednesday","Thursday","Friday","Saturda"};
	weekday[0]="Sunday";
	weekday[1]="Monday";
	weekday[2]="Tuesday";
	weekday[3]="Wednesday";
	weekday[4]="Thursday";
	weekday[5]="Friday";
	weekday[6]="Saturday";
	
	}

}
