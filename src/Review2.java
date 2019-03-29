import java.util.*;
public class Review2 {

	public static void main(String[] args) {
		///Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
        // If the age is greater than 100  print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		
		int age=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		if (!(age>=18)) {
		System.out.println("You are Too Young");
		
		}else if (age >=18 && age <=35){
		System.out.println("Young person");
	} else if (age >=36 || age <=99){
		System.out.println("Middle age");
	}else if (age >=100) {
		System.out.println("You are too Old");
		
	}else {
		System.out.println("Unknown age");
	}
	}
	}
