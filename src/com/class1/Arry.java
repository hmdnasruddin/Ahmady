package com.class1;

public class Arry {

	public static void main(String[] args) {
		int num;
		num=10;
		int[] arry1;//dealare an array -->perferred way
		int[] arry2;//declare an arry;
		int[] arry3;//declare ann arry;
		
		arry1=new int[4];//initialize, create an arry
		
		//aaigning value
		arry1[0]=10;
		arry1[1]=20;
		arry1[2]=30;
		arry1[3]=40;
		
		System.out.println(arry1[0]);
		
		int[] numbers=new int[3];
		
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		numbers[3]=20; no error during compiliation but erro during run tie
		
		System.out.println(numbers[3]);//ArrayIndexOutOfBoundsException
		
		System.out.println(numbers[0]+numbers[2]);
		
       String[] a=new String[3];
       a[0]="Hello";
       a[1]="Hi";
       a[2]="Bye";
       
       System.out.println(a[2]+"friends");
       
       
	}

}
