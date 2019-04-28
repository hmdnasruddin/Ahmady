package com.class23;

public class ConstructorOverloading {

	ConstructorOverloading() {
		System.out.println("I am a constractor with no parameter");
	}

	ConstructorOverloading(String str) {
		System.out.println("I am a constructor with 1 parameters");
	}

	ConstructorOverloading(String str, String str1) {
        System.out.println("I am a cnostructor with 2 parameters");
	}

	ConstructorOverloading(String str1, String str2, String str3) {
		System.out.println("I am a cnostructor with  3parameters");
	}
}