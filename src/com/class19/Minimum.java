package com.class19;

public class Minimum {
	static int minOfValues(int [] x ) {
	   int max=x[0];
		
	   for(int y:x) {
		   if(y>max) {
			   max=y;
		   }
	   }
		return max;
		
	}
	void print() {
		int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	       int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		 System.out.println("Printing the minimum value");
	      
	      System.out.println(Minimum.minOfValues(my_array));
	      System.out.println(Minimum.minOfValues(array));
	}
	
	}


