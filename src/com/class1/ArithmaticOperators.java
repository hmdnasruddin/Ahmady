package com.class1;

public class ArithmaticOperators {

	public static void main(String[] args) {
		//declare 2 int variables and then we perform:
		//addition, subtruction, multiplicatin, division
		
		int a=30;
		int b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum); //45
		System.out.println(sub); //15
		System.out.println(mult); //450
		System.out.println(div);  //2
		
		//print: the __ of 2 numbers is ___
		
		System.out.println("the addition of 2 number is "+sum);
		System.out.println("the sub of 2 number is  "+sub);
		System.out.println("the mult of 2 number is "+mult);
		 
		System.out.println("the div of 2 number is "+div);
		
		System.out.println(" the addition of 2 number is " +sum+ " the sub of 2 is " +sub+ " the mult of 2 is " +mult+ " the div of 2 is " +div+ ".");

	}

}
