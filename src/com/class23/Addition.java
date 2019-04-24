package com.class23;

public class Addition {
    // overloading methods by chaning number of parameters
	public void add(int a, int b) {
		System.out.println("Method to add 2 integers");
		System.out.println(a+b);
	}
	public void add(int a) {
		System.out.println("Method to add 1 integers");
		System.out.println(a+100);
    }
	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 integers");
		System.out.println(a+b+b);
	}
	//2. overloading method by chaging th date type of the paramehters
	public void add(double a, double b) {
		System.out.println("Method to add 2 double values");
		System.out.println(a+b);
	}
	public void add(int a, double b) {
		System.out.println("Method to add 1 integer and 1 double values");
		System.out.println(a+b);
   }
	public void add(double a, double b, double c) {
		System.out.println("Method to add 3 doubles values");
		System.out.println(a+b);
	}
}
