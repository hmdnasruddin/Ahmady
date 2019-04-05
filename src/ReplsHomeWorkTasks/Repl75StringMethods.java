package ReplsHomeWorkTasks;

import java.util.Scanner;

public class Repl75StringMethods {
	
	public static void main(String[] args) {
//		For you to do:
//			If browser is ChRoME
//			It should print the 
//			Proceed with chrome Browser
//			If browser is FireFOX
//			It should print the 
//			Proceed with firefox Browser
//			If browser is Ie
//			It should print the 
//			Proceed with ie Browser
//			If any other browser 
//			It should print the  
//			Invalid Browser
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();

		String b = "ChRoME";
		if (browser.equals("browser is ChRoME")) {
			System.out.println("Proceed with chrome Browser");
		} else if (browser.equals("browser is FireFOX")) {
			System.out.println("Proceed with firefox Browser");
		} else if (browser.equals("browser is Ie")){
			System.out.println("Proceed with ie Browser");
		} else {
			System.out.println("Invalid Browser");
		}
	}

}
