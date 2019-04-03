package com.class1;

public class ReviewString {

	public static void main(String[] args) {
		
		 /*
	        * Write a program that:
	        * Converts all the characters in the string to lower case and prints.
	        * Converts all the characters in the string to upper case and prints.
	        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
	        * Counts the number of letter 'a' in the string/paragraph and prints.
	        * Prints the second half of the string/paragraph.
	        * Prints characters between the 10th and 20th indices(inclusive).
	        * Prints the string/Paragraph in reverse order.
	        * Clears/removes all white spaces or tabs on both ends and prints.
	        */

	       String para = "The quick brown fox jumps over the lazy dog.";
	       
	       System.out.println(para.toLowerCase());
	       System.out.println(para.toUpperCase());
	       
		
		 System.out.println(para.startsWith("The"));
		 System.out.println(para.endsWith("The"));
		
	       System.out.println(para.startsWith("The"));
	       System.out.println(para.endsWith("dog."));
	       
		
		  INT COUNT = 0; FOR(INT I =0; I<PARA.LENGTH(); I++) { IF(PARA.CHARAT(I) ==
		  'A') { COUNT++;
		  
		  }
		  
		  } SYSTEM.OUT.PRINTLN(COUNT);
		  
		  SYSTEM.OUT.PRINTLN(PARA.SUBSTRING(PARA.LENGTH()/2));
		  SYSTEM.OUT.PRINTLN(PARA.SUBSTRING(10, 20));
		  
		  FOR(INT I=PARA.LENGTH(); I>0; I--){ SYSTEM.OUT.PRINTLN(PARA.CHARAT(I)); }
		  SYSTEM.OUT.PRINTLN(PARA.TRIM());
		 
	}

}
