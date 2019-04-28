package com.class26;

public class SuperKeyword {
    
	String name="John";
	
	public void syaName() {
		System.out.println("Parent name is "+name);
	}
}
class ChildOfSuperKeywrod extends SuperKeyword{
	
	String name="Mechael";
	
	public void sayName() {
		System.out.println("Parent name is"+super.name);
		System.out.println("Child name is "+name);
	}
	public void callingMethods() {
		sayName();//sayName
		super.syaName();
	}
}