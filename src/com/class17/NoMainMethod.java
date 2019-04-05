package com.class17;

public class NoMainMethod {
	
	String str;
	int num;
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
	}
	public static void main(String[] args) {//Method signature
		
		NoMainMethod obj=new NoMainMethod();//Method body
		obj.hello();//we calling a method hello
		obj.bye();

	}
	void howAreYou() {
		System.out.println("How Are You?");
	}
	
}

