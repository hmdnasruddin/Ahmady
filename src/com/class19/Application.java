package com.class19;

public class Application {
	public static void main(String[] args) {
		
		Human per1 =new Human();
		per1.print();
		per1.eyeColor="Pink";
		per1.print();
		
		System.out.println(per1.gender);
		System.out.println(per1.height);
		System.out.println(per1.weight);
		System.out.println(per1.eyeColor);
		
		
		Human per2 =new Human();
		per2.eyeColor="Orang";
		per2.print();
		
		System.out.println(per2.gender);
		System.out.println(per2.height);
		System.out.println(per2.weight);
		System.out.println(per2.eyeColor);
		
		Human per3 =new Human();
		per3.eyeColor="White";
		per3.print();
		System.out.println(per3.gender);
		System.out.println(per3.height);
		System.out.println(per3.weight);
		System.out.println(per3.eyeColor);
		
		
	    
	
		

}
}

