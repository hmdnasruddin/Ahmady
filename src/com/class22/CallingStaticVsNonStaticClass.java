package com.class22;

public class CallingStaticVsNonStaticClass {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		//accessing non static members
		obj.getInfo();
		//access static members by using className they belong to 
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();

	}

}
