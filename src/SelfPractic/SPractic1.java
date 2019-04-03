package SelfPractic;

public class SPractic1 {

	public static void main(String[] args) {
		String str = "I love my son soo much";
		String str1 = "I love My son soo much";

		System.out.println(str.length());

		System.out.println(str.charAt(14));

		System.out.println(str.indexOf('o', str.indexOf('o' + 1)));

		System.out.println(str.indexOf("much"));

		System.out.println(str.indexOf("dear"));

		// String comparisan
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		// Substring
		System.out.println(str.substring(5, 16));
		// trim
		String str2 = "   Good   morning    ";
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ", ""));
		String date = "01/01/2020";
		System.out.println(date.replace("/", "-"));
		// Split String

		String test = "Welcom_to_my_home";
		String[] testval = test.split("_");
		for (int i = test.length() - 1; i > 0; i--) {
			System.out.print(test.charAt(i));
		}
	}
}
