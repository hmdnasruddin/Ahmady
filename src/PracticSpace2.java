import java.util.Scanner;

public class PracticSpace2 {

	public static void main(String[] args) {
		//Write a program to take values of length and width 
		//from user and check if it the shape of the object is square or rectangle. 

       //Examples:

        //Please enter the length 18
        //Please enter the width 16
        //The shape of your object is rectangle
        //Please enter the length 16 
        //Please enter the width 16 
        //The shape of your object is square
		
		 int l;
	     int w;
	        Scanner shape = new Scanner(System.in);
	        System.out.println("Please enter the length");
	        l = shape.nextInt();
	        
	        System.out.println("Please enter the width");
	        w = shape.nextInt();
	        
	        if(l!=w) {
	            System.out.println("The shape of your object is rectangle");
	        }
	        else {
	            System.out.println("The shape of your object is square");
	        }    
	    }

	}
