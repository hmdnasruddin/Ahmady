package com.class25;

public class SyntaxStudent extends UserClass {

	public void study() {
		System.out.println("Syntax Students must study hard");
       
	}

	protected void doHomeWork() {
		System.out.println("Syntax Students must study help");
	}

	void attendClasses() {
		System.out.println("Student must attend classes");

	}

	private void doResearch() {//private methods connot be overriding
		System.out.println("Student must do research");
	}
}