package com.class23;

public class MainMethodOverload {

	public static void main(String[] args) {
		System.out.println("I am main method with string argument array");

	}
	public static void main() {
		System.out.println("I am a method with no parameters");
	}
   public static void main(String args) {
	   System.out.println("I am a method with string arguments parameters");
   }
   public static void main(int a) {
	   System.out.println("I am a method with integer parameters");
}
}
