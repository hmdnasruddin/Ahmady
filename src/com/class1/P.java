package com.class1;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter the start and end number");

		int sN;
		int eN;
		int sumofEven = 0;
		int sumofOdd = 0;
		sN = scan.nextInt();
		eN = scan.nextInt();

		for (int a = sN; a < eN; a++) {
			if (a % 2 == 0) {
				sumofEven += a;
			} else {
				sumofOdd += a;
			}
		}
		System.out.println("Your sum of even numbers are:"+sumofEven);
		System.out.println("Your sum of odd numbers are:"+sumofOdd);
	}
}
