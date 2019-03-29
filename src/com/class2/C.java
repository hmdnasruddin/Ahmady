package com.class2;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		/*1. Write a program that reads a set of integers, provided 
		 */
		
	Scanner scan;
	int sN; int eN;
	int sumodd=0; int sumeven=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please start number and end number");
	eN=sc.nextInt();
	sN=sc.nextInt();
	
	for (int a=sN; a<=eN; a++) {
		if(a%2==0) {
			sumeven+=a;
		}else {
		
		}
	}
	System.out.println("The sum of odd numbers in yur range is "+sumodd+"and sum of the odd number is"+sumeven);


	}

}
