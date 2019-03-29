package com.class1;

public class Repl60 {

	public static void main(String[] args) {
		 int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 }, };

	       System.out.println("Length of row 1: " + ar[0].length);
	       System.out.println("Length of row 2: " + ar[1].length);
	       System.out.println("Length of row 3: " + ar[2].length);

	       for (int[] innerArr : ar) {
	           int i = 1;
	           System.out.println("Length of row " + i + ": " + innerArr.length);
	           i++;
	       }

		
	//}
	//write a program to print the length of each array.
	int [][] arr={{1,2,3},
			     {4,5,6,9}, 
			        {7,8}};
	
	for(int i=0; i<arr.length; i++) {
			System.out.println("The length of row"+ i +1+ "="+arr[i].length);
			
		}
	for(int[] inn: arr) {
		for(int elements: inn) {
			System.out.print(elements);
		}
	}
	}
}
	
	

