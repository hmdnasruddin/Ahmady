package com.class1;

public class Reveiw2DArray {

	public static void main(String[] args) {
		// Write a program to find the average of row 2.
		int[][] ratting = { 
				{ 2, 6, 9, 3, 7 },
				{ 1, 7, 9, 4, 8 },
				{ 0, 4, 6, 2, 5 },
				{ 0, 1, 2, 3 } };

		double sum = 0;
		for (int i = 0; i < ratting[1].length; i++) {
			sum += ratting[1][i];
		}
		
		System.out.println(sum/ratting[1].length);
	
	}
}
