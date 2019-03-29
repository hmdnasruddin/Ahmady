package com.class1;

public class ArrayClassPractic {

	public static void main(String[] args) {
		/*1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 * 
        2.Create an array of names and store all names of your group.
         Then print your name from that array. (use 2 different ways of creating an array).

        3.Create an array of words: Java, Saturday, day, coding, is. 
        Print the following sentence using element of array: “Saturday is Java coding Day”.*/
      String []grades=new String[6];
        
		char[] a = {'A','B','C','D','E','F'};
		System.out.println(a[5]);
		
		String[]words= {"Java","Saturdsy", "dsy", "coding", "is"};
		System.out.println(words[1]);
		
		
		
	}

}
