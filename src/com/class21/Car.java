package com.class21;

public class Car {
   
	public String color;//null
	public static int totalCars;//0+1+1=2
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		totalCars++;
		
		Car car2=new Car();
		car2.color="Black";
		totalCars++;
		
		System.out.println("Total car we nade is "+ totalCars);
		

	}

}
