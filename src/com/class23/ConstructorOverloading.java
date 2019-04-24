package com.class23;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("I am a constructor with no parameters");
	}
	
	ConstructorOverloading(String str ){
		System.out.println("I am a constructor with 1 parameters");
		
	}
	ConstructorOverloading(String str, String str1){
		System.out.println("I am a constructor with 2 parameters");
	}
	ConstructorOverloading(String str, String str1, String str2){
		System.out.println("I am a constructor with 3 parameters");
	}
	

}
