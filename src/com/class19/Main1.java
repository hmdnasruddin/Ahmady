package com.class19;
public class Main1{
    
	   String name,carColor;
	   int model;
	   
		public static void main(String[] args) {
			Main1 car1 = new Main1();
			car1.carColor="Black";
			car1.name="BMW";
			car1.model=2019;
			
			Main1 car2=new Main1();
			car2.carColor="White";
			car2.model=2018;
			car2.name="Toyota";
			
			System.out.println("car color is " +car1.carColor + " and car model is " +car1.model+ "  car name is "+car1.name);
			System.out.println("car color is " +car2.carColor + " and car model is " +car2.model+ "  car name is "+car2.name);
		}
	    
	
	}
