package com.class21;

public class Employee {
      private static final String Salary2 = null;
	public static int number, eID, salary;
      public String name;
     
	public static void main(String[] args) {
		/*Create a Class called Employee:
          Create three  variables  eID , salary and set the CEO to “Sumair”
          Create two objects of the class Employee
          Set the value of eID, salary for each of the objects
          Print out the eID , salary and  CEO for each of the objects*/ 
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		String name1="Sumair";
		String name2="Sumair";
		
		e1.eID=123;
		e2.eID=1234;

		int salary1=5000;
		int salary2=6000;

		
		System.out.println("Employee name1 is " +name1+"Employee eID is " +eID+"Employee Salary1 is "+salary1);

	}
	void employeeInfo() {
	String name2 = null;
	System.out.println("Employee name2 is "+ name2+ "Employee eID is "+ eID+ "Employee Salary is "+ Salary2);
	}

}
