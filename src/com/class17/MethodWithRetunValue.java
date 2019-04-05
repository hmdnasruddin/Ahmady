package com.class17;

public class MethodWithRetunValue {

	public static void main(String[] args) {
		String str="Hello";
		int stringlength=str.length();
		System.out.println(stringlength);
		
		char character =str.charAt(3);
		System.out.println(character);
		
		MethodWithRetunValue obj=new MethodWithRetunValue();
        String day=obj.whatIsADay();
        System.out.println("Today is Thursday");
	}
	void askHowAreYou(String name) {
		System.out.println("How are you"+name);
	}
	String whatIsADay() {
		return "Thursday";
	}

}
