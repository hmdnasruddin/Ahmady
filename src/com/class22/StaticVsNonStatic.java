package com.class22;

public class StaticVsNonStatic {
    public String name="John";//intance variable
    
    public static String lastName="Snow";//static variable
    
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();//within same class we can call it by using method / variable name
		
		System.out.println(lastName);
		System.out.println(obj.name);
	}
	//non static method - can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+" and my last naem is "+lastName);
		//getInfo1(); we can access static only static vaiables
	}
	//static method can have an access only to static variable
   public static void getInfo1() {
	    //System.out.println("My name is "+name+" and my last naem is "+lastName);
	   //will get an error
	  System.out.println("I am a static method");
	  //we cannot access non static method within static
   }
   
}
