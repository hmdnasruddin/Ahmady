package com.class19;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
    
    System.out.println("enter 3 integers");
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    System.out.println("Sum is "+Calculator.sum(a, b, c));
    System.out.println("Average is "+Calculator.avg(a, b, c));
    System.out.println("Minimum is "+Calculator.min(a, b, c));
    System.out.println("Maximum is "+Calculator.max(a, b, c));
}

}
