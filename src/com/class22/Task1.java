package com.class22;

import ReplsHomeWorkTasks.Main;

public class Task1 {
	String objName;
	String objLName;
	int objAge;

	/*
	 * 1.Write a program that will have a constructor: one with parameters and
	 * second without any parameters. Create a separate Test class where you will
	 * execute both of the constructors. 
	 * 2. Write a java program of Class Students
	 * that takes students name and 3 subject grades. Inside your class also have a
	 * method to Calculate Average Grade. Test Student class for 5 different
	 * students with different marks. Your program should print an average mark of
	 * each students name. NOTE: please male different names for instance and local
	 * variables. (edited)
	 * 
	 * 3. Write a program that will have a private default constructor class and
	 * create 2 objects of this class: 1 - inside same class; 2 - from outside the
	 * class.
	 * 
	 * 4. Write program that have static constructor and observe result. (edited)
	 */

	Task1() {
		System.out.println("This is a constructor with out parameters");
	}

	Task1(String name, String Lname, int age) {
		objName = name;
		objLName = Lname;
		objAge = age;

	}

	public static void main(String[] args) {

		Task1 obj1 = new Task1();
		Task1 obj2 = new Task1("Ahmad", "Mahmod", 25);
		
		
		System.out.println("This is " + obj2.objName  +" "+obj2.objLName + " age "+ obj2.objAge);

	}

}
