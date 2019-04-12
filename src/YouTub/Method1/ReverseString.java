package YouTub.Method1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a valid String ");
		String original=scan.nextLine();
		
		while (original.isEmpty()|| original ==null) {
			System.out.println("Please enter a valid String: Empty Strings are not accetped");
			original=scan.nextLine();
		}
		scan.close();
	}
	
	private String reverseCharacters output=new reverseCharacters();
		String reverse="";
		
		for(int i=reverseCharacters.length()-1; i>=0; i++) {
			reverse=reverse+reverseCharacters.charAt(i);
			System.out.println();
		}
		return reverse;
		
	}
}
