package com.class22;

public class Car {
	
	public static String make="Toyot";
	String color;//declaring instance variable
	String model;
	int doors;
	boolean engine;
	
	Car(){
		System.out.println("Hello I am a constructor");
		System.out.println("Hello from constructor ");
		hello();
	}
	public static void main(String[] args) {
		Car obj=new Car();
		System.out.println(obj.color);
		System.out.println(obj.model);
		System.out.println(obj.color);
		System.out.println(obj.engine);
		
	}
	public static void hello() {
		String name;
		System.out.println("I am a static hello method ");
		
	}
	}


