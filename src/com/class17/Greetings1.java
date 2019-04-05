package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		Greetings1 obj = new Greetings1();
		obj.askHowAreYou2("Omer");
        
	}

	void askHowAreYou(String name) {
		System.out.println("How are you " + name);
	}

	void askHowAreYou1(String name) {
	}

	void askHowAreYou2(String name) {
		System.out.println("I don't love you " + name);
	
    }
}
