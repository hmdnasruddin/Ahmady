package com.class17;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		// Scanner class, String
		
		String str=new String("Hello");
		str.isEmpty();// bult-in method that comes with String class
		
        Scanner scan=new Scanner(System.in);
        scan.hasNextInt();
        
        //Methods are 2 types:
        //built-in: String/Scanner class methods, --> limited and read only 
        //User defined: we create them --> unlimited and modifiable
	}

}
