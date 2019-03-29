package com.class2;

import java.util.Scanner;

public class Repl73 {

	public static void main(String[] args) {
		/*
		 * Write a program using the switch statement Let us consider there are three
		 * students in the class with roll number starting from (101 to 103) if any
		 * number other than 101-103 are present display
		 * "Not found Student name: in Class"
		 * 
		 * First Output: "enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh "
		 * 
		 * case 102 :if roll number is 102 print as "Student name: Mahesh "
		 * 
		 * case 103:if roll number is 103 print as "Student name: Mukesh "
		 * 
		 * other than this roll number it should print
		 * "Not found Student name: in Class"
		 */

		int name;
		int name1;
		
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the roll number of the Child");
	    name=scan.nextInt();
	  
	    switch(name)
	    {
	      case 101:
	        System.out.println("Student name: Ramesh");
	        break;
	      case 102:
	    	  System.out.println("Student name: Mahesh");
	        break;
	      case 103:
	    	  System.out.println("Student name: Mukesh");
	        break;
	      default:
	      System.out.println("Not found Student name in Class");

	          
	    }
	  }
	 
	}