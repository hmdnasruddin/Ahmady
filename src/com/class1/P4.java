package com.class1;

public class P4 {

	public static void main(String[] args) {
		// 4. Print the following pattern:
		/**
		**
		***
		****
		*****
		****
		***
		**
		*
		*/
		for(int i=1; i<6; i++) {
			for(int y=1; y<i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i= 1; i<4; i++) {
			for(int y=4; y>i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
