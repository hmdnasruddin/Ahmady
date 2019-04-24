package com.class23;

public class Employee {
	
    static String department="IT";
    int salary;//default
    protected int salary1;//protected
    
    
 public void getPaid() {
	 System.out.println("Employee gets paid "+salary);
	 
 }
 public void work() {
	 System.out.println("Employee works in "+department+"department");
 }
 protected void test() {
	 System.out.println("I am a protected method");
 }
 void test1() {
	 System.out.println(" I am a default method");
 }
}
