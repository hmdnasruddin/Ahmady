package InterveiwPractic;

import java.util.Scanner;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// Write a Java program to find weather a String is palindrome or no?
		// (dad, mom, madam)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any word to check if it a palidrome!");
		String word=scan.nextLine();
		
		String reverse="";
		for(int i=word.length()-1; i<=0; i--) {
			reverse+=word.charAt(i);
		}
		System.out.print(reverse);
		
	
    if(word.equalsIgnoreCase(reverse)) {
    	System.out.println("The word is palidrome");
    }else {
    	System.out.println("The word is not a palidrome");
    	
    }
    }
	}


