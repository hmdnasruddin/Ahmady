import java.util.*;
public class LogicalOperators {

	public static void main(String[] args) {
		/* if number is between 1-10 -->number is small
		 * if number is between 11-100--> number is medium
		 * if number is between 101-1000--> number is large
		 */
        int num=15;
        int num1=14;
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the number");
       num=sc.nextInt();
       
       if(num1 >=1 && num1 <=10) {
    	   System.out.println("the number is small");
    	   
       }else if(num1 >=11 && num1<=100) {
    	   System.out.println("the number is medium");
    	   
       }else if (num1 >=101 && num1 <=1000) {
    	   System.out.println("the number is large");
    	   
       }else {
    	   System.out.println("the number is unknown");
    	   
       }   
    }
   		
}       



