package com.class27;

public class Hello {
 /***
  * Create a class called Hello
     * create 1 constructor with one parameter
     * create 1 constructor with two parameters
     * create 1 constructor with three parameters
     * 
     * I want you to use "this" key word and access those constructors pass values for each
     * but have one print statement for each constructor with one variable. make sure you use same
     * data type
     */
	
	Hello(String a){
		System.out.println("I am a constructor with one parameter");
		}
	Hello(String a, String b){
		this("Hello");
		System.out.println("I am a contructor with two paramters");
	}
	Hello(String a, String b, String c){
		this("Hello","Bye");
		System.out.println("I am a constructor with three parameters");
	}
	public static void main(String[] args) {
		Hello obj=new Hello("How","Are","You");
	}
}