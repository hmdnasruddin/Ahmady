package com.class1;

public class Repl2D61 {

	public static void main(String[] args) {
		
		 TwoDimArrayMethods operate = new TwoDimArrayMethods();
	     
		 int[][] board   =
	      {
	         { 20, 15, 6, 19, 18 }, { 4, 46, 24, 17, 18 },
	         { 12, 50, 23, 16, 31 }
	      };

	      operate.printMatrix(board);
	      System.out.println();
	      operate.sumRows(board);
	      System.out.println();
	      operate.largestInRows(board);
	   }
	}
	


