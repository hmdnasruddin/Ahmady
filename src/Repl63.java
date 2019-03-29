
public class Repl63 {
	public static void main(String[] args) {
		// Write a program that takes a 2-D array and prints the sums of the rows as an
		// integer array.

//For example, the if we run rowSums for the following 2D array:
		int[][] arry = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		sum=0;
		for (int i = 0; i < arry.length; i++) {
			for (int y = 1; y < arry[i].length; y++) {
				System.out.print(arry[i][y]);
			}
		}
      
	}

}
