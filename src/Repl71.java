import java.util.Scanner;

public class Repl71 {

	public static void main(String[] args) {
		/*
		 * // Create main Method!!!!!!!! Scanner Class and Switch case is needed for
		 * this Assignment
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * First Output: "enter name of the instructor"
		 * 
		 * case 1: if User provided the name as Shiva as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Sandish as input it should show "Will take care of SDLC Assignment" case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment"
		 * other than these four names if user provide the name try to give like (James
		 * or John ) " Invalid instructor selected"
		 */
	
		
		   
	        String name;
	        String assignment;
	        String assignment1;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name of the instructor");
			name=sc.nextLine();
			
			
			switch (name) {
			
			case "Shiva":
				System.out.println("Java Assignment");
				break;
			case "Sandish":
				System.out.println("SDLC Assignment");
				break;
			case "Weqas":
				System.out.println("selenium Assignment");
				break;
			case "Asel":
				System.out.println("every Assignment");
				break;
				default:
					System.out.println("Invalid instructor selected");
			
			}
		}

	}
