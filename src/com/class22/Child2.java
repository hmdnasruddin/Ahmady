package com.class22;

public class Child2 extends Parent{
	
	String hairType="curly";
	
	public static void main(String[] args) {
		
		Parent childObject=new Parent();
		System.out.println("Child 2 eye color "+childObject.eyeColor+ "Child 2 hair color "+childObject.hairColor+childObject.nose);
	}

}
