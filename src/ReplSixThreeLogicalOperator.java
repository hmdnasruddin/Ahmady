import java.util.Scanner;

public class ReplSixThreeLogicalOperator {

	public static void main(String[] args) {
// Prompt user to input two strings : "Please enter two strings"
//and two integers: "Please enter two numbers"  
//and make the comparisons:
//if int1 and int2 are equal and word1 and word2 are equal, output "AND"
//if int1 and int2 are equal or word1 and word2 are equal, output "OR"
//if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		
//Example input/output:
//			word1: banana
//			word2: apple
//			int1: 2
//			int2: 2
//			OR
//			word1: banana
//			word2: banana
//			int1: 2
//			int2: 2
//			AND
//			word1: phone
//			word2: pie
//			int1: 2
//			int2: 3
//			NONE
		
		    int num1, num2;
		    String word1, word2;
	        
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Please enter two numbers");
	       num1=sc.nextInt();
	       num2=sc.nextInt();
	       System.out.println("Please enter two Strings");
	       word1=sc.nextLine();
	       word2=sc.nextLine();
	       
	       if (num1==num2 && word1.equals (word2)) {
	    	   System.out.println("AND");ou
	    	   
	       }else if(num1 == num2 || word1.equals(word2)){
	    	  System.out.println("OR"); 
	    	  
	       }else if (num1 != num2 && word1 != (word2)) {
	       System.out.println("NONE");
	       }else 
	    	   System.out.println("Unknown");
	       
	    	   
	       }
	
	
     }

