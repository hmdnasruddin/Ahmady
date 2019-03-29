import java.util.Scanner;

public class RepL72 {

	public static void main(String[] args) {
		// Create main method!!!!!!!!!!!!
//		Scanner Class and Switch case is needed for this Assignment

//		Write a program using the switch statement  
//		Let us consider the scenario regarding the born baby age 
//
//		First Output: "enter the age of the Child"
//
//		case 1: if age is 1 print as "You can Crawl"
//
//		case 2 : if age is 2 print as  "You can Talk"
//
//		case 3: If age is 3 print as "You can Dance"
//
//		case 4: if age is 4 print as "You can get  Trouble"
//
//		other than this age (1-4) it should print "I don't know how old you are"
		String name;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name=scan.nextLine();
		
		switch (name) {
		
		case "Shiva":
			System.out.println("Will take care of Java Assignmnent");
			break;
		case "Weqas":
			System.out.println("Will take care of SDLC Assignmnent");
			break;
		case "Asel":
			System.out.println("Will take care of every Assignmnent");
			break;
		case "How":
			System.out.println("Will take care of Java Assignmnent");
			break;
		}
	}

}
