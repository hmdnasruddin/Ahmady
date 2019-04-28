package com.class26;

public class Car {
	public void drive() {
		System.out.println("Car can be drive");
		}
	}
class BMW extends Car{
	public void drive() {
		System.out.println("BMW can drive fast");
	}
}
class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota can drive more fast");
	}
}