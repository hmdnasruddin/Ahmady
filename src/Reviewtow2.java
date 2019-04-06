
public class Reviewtow2 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the following pattern. ....1 ...22 ..333 .4444
		 * 55555
		 */

		// 1 to 5
		// 1 to 5-i
		// 1 to i

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= (5 - i); k++) {
				System.out.print(".");
			}
			for (int l = 1; l <= i; l++) {

				System.out.print(i);
			}

			System.out.println();
		}
	}

	void pirntPatterns() {
		/*
		 * Write a program that prints the following pattern. 
		 * ....1 
		 * ...22 
		 * ..333 
		 * .4444
		 * 55555
		 */
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= (5 - i); k++) {
				System.out.print(".");
			}
			for (int l = 1; l <= i; l++) {

				System.out.print(i);
			}

			System.out.println();
		}
	}
}
