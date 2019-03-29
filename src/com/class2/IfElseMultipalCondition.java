package com.class2;

public class IfElseMultipalCondition {

	public static void main(String[] args) {
		int age = 18;
		if (age == 18) {
			System.out.println("Your eligible to get license");
			if (age == 17) {
				System.out.println("You are not eligible to get license ");
			} else if (age == 19) {
				System.out.println("You have to take driving course");
			} else {
				System.out.println("Wite for one year");

			}

		}
	}
}
