package InterveiwPractic;

public class SplitClassTask {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable? 2.Write a java program to find the
		 * second largest number in the array? Maximum and minimum number in the array?
		 * 3.Find out how many alpha characters present in a string? 4.How to find out
		 * the part of the string from a string? What is substring? Find number of words
		 * in string? 5.Write a java program to reverse String? Reverse a string word by
		 * word?
		 */

		int a = 10;
		int b = 5;

		a = a + b; // a=10+5=15;
		b = a - b; // b= 15-5=10;
		a = a - b; // a=10-5=5;

		System.out.println("After swaping:" + " a = " + a + ", b = " + b);

		// int x = 5, y = 10;
		// x = x ^ y ^ (y = x);
		// System.out.println(x +" "+y);

		System.out.println();

		String x = "Hello";
		String y = "Bye";

		System.out.println("Before swap: " + x + " " + y);

		x = x + y; // Hello+Bye=HelloBye

		y = x.substring(0, x.length() - y.length()); // HelloBye-Bye=Hello

		x = x.substring(y.length()); // HelloBye(Hello)=Bye

		System.out.println("After : " + x + " " + y);

		int[] array = { 1, 2, 3, 4, 98, 6 };
		int highest = 0;
		int h2 = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > highest) {
				h2 = highest;
				highest = array[i];
			} else if (array[i] > h2) {
				h2 = array[i];

			}
		}
		System.out.println("The second highest " + h2);

		int max = array[0];

		for (int y1 = 1; y1 < array.length; y1++) {
			if (array[y1] > max) {
				max = array[y1];
			}
		}

		int min = array[0];
		for (int w = 0; w < array.length; w++) {
			if (array[w] < min) {
				min = array[w];
			}
		}
	}
}
