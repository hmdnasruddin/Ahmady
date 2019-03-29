import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {
		// write a program to found out the user level of experience 
		// Must use a switch statement with a String variable named LevelString and int variable named Level 
		//Beignner Level should be 1
		//Intermdiate Level should be 2
		//Expert Level should be 3
		
		String LevelString;
		int Level=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Level");
		Level=scan.nextInt();
		
		switch (Level) {
		case 1:
			LevelString="Beginner";
			break;
		case 2:
			LevelString="Intermediate";
			break;
		case 3:
			LevelString="Expert ";
			break;
		case 4:
			default:
		    LevelString="LevelString";
		    break;
		}
		System.out.println("Your Level is "+LevelString);
		    	
		}
		

	}


