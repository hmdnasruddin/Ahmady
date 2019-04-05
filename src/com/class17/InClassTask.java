package com.class17;

public class InClassTask {

	public static void main(String[] args) {
		InClassTask obj=new InClassTask();
		obj.findLargestNum(20, 45);
		//1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
	    //2.Create a method that will take a number and prints whether the number is even or odd.
	    //3.Create a method that will print whether given String is palindrome or not.
	  
	}
	void findLargestNum(int a, int b) {
		System.out.println("A is largar than B ");
		
	if(a<b) {
		System.out.println("A is largar than B");
	}else{
		System.out.println("B is largar than A");
	}
	
}
}