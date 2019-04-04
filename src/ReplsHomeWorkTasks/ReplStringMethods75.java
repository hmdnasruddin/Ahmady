package ReplsHomeWorkTasks;

import java.util.Scanner;

public class ReplStringMethods75 {

	public static void main(String[] args) {
		/*
		 * If language is Java? It should print the Java is a programming language. If
		 * language is C? It should print the C is a procedural programming language If
		 * language is C++?It should print the C++ is a middle-level pro1gramming
		 * language If any other? should print Doesn't match any programming language
		 */

		System.out.println("Enter any programming language");
		
		String language =sc.nextLine();
		  //
		  String a="Java";
		  if(language.equals("Java")){
		    System.out.println("Java is a programming language.");
		  }else if(language.equals("C")){
		    System.out.println("C is a procedural programming language");
		  }else if(language.equals("C++")){
		    System.out.println("C++ is a middle-level programming language");
		  }else {
		    System.out.println("Doesn't match any programming language");
		  }
		 }
		}
