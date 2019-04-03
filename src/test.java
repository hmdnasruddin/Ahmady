
public class test {

	public static void main(String[] args) {
		// 1-Create a String and print it in reverse order(Sunday -->yadnuS)
		// 2-Creat a String and if the String is not empty perfrom the following: if the
		// String
		// has an odd number of charcters and has 3 or more charcaters print the
		// character in
		// the iddle of the String.

		String str = "Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
       
	}
}
