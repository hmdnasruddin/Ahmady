package com.classReview8;

public class MainInherintence {
	/**I want you to create two classes one called MainInherintence and second class
	 * ChildInherintence
	 * in your main class i want you to create 1 method to swap numbers, and another
	 * to swap strings
	 * and in your child i want you to extend main, and i want you to create the
	 * same methods, and paramters, but in the block of code i want you to print
	 * "not reversing" for swap numbers, and print 2 "not reversing" swap String
	 */
    public void swapNumbers(int a, int b) {
    	a=10; 
    	b=5;
    	a=a+b;//10+5=15;
    	b=a-b;//10-15=5;
    	a=a-b;//15-5=10;
    	System.out.println(a);
    	System.out.println(b);
    	}
    public void swapWords(String a, String b) {
    	a=a+b;
    	b=a.substring(0,a.length()-b.length());
    	a=a.substring(b.length());
    	System.out.println(a+" "+b);
    }
    }
	    