package com.class21;

public class InstanceVariables {
   String name ="John";// instance variable can have access modifiers
	public static void main(String[] args) {
		
		String name="Anna";
		System.out.println(name);
		System.out.println("---Changing value of local variable ---");
		name="Olga";
		System.out.println(name);
		//-------------------------------------------------------------------------;
		//Creating first object
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		obj.name="Jack";
		System.out.println(obj.name);
		//------------------------------------------------------------------------;
		//Creating second object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);

	}
   public void hello() {
	   System.out.println("Hello "+name);
   }
}
