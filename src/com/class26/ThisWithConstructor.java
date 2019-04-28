package com.class26;

public class ThisWithConstructor {

	 public ThisWithConstructor() {
		 //this() calls current class constructor -->chaining
		 System.out.println("I am inside constructor with no parameters");
		System.out.println("I have no parameters");
	}
	 ThisWithConstructor(String str){
		 this();
		 System.out.println("I am inside constructor with 1 parameters");
		 System.out.println("I have 1 string parameter "+str);
	 }
	 ThisWithConstructor(String str1, String str2){
		 this (str1);
		 System.out.println("I am inside constructor with 2 parameters");
		 System.out.println("I have 2 string parameters "+str1+" "+str2);
	 }
	 public static void main(String[] args) {
//	   ThisWithConstructor obj1=new ThisWithConstructor();
//	   ThisWithConstructor obj2=new ThisWithConstructor("Hello");
	   
	   ThisWithConstructor obj3=new ThisWithConstructor("Helle","Bye");
	   /*I am inside constructor with no parameters
	    * I am inside constructor with 1 parameters
	    * I am inside constructor with 2 parameters
	    */
	}
}
