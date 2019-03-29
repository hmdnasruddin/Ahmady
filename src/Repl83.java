
public class Repl83 {

	public static void main(String[] args) {
		/*Create a while loops that prints out even numbers from 1 to 13
		 * Must not include the number 13 in the output
		 * 
		 * Increment by 1 example(a++)
		 * 
		 * Output: 2 4 6 8 10 12
		 */

		for (int i = 1; i <=12; i++) 
		{
		if (i % 2 == 0)	{
			System.out.println(i);
		}
		}
	}
}