package Inheretance;

public class Parent {

	Parent() {
		System.out.println("I am from Parent Class");
	}
	/*
	 * Task: Create Methods in your Parent Class, one method i want you to return a
	 * reverse method for a string with one parameter. Then create a second method
	 * same name as the reverse string but taking two string parameters. For method
	 * taking two parameters reverse(one, two) Output should be eonwot make sure
	 * both strings are equal in length!!!
	 */

	public static void main(String[] args) {
		Parent p = new Parent();
		p.reverse("one", "two");
	}

	// This will reverse 1 parameter string
	String reverse(String first) {
		String reverse = "";
		for (int i = first.length() - 1; i >= 0; i--) {
			reverse = reverse + first.charAt(i);
		}
		return reverse;
	}

	String reverse(String first, String second) {
		String reverse = "";
		if (first.length() == second.length()) {
			for (int i = first.length() - 1; i >= 0; i--) {
				reverse = reverse + first.charAt(i) + second.charAt(i);
			}

		} else {
			System.out.println("strings are not same length");
		}

		return reverse;
	}

}
