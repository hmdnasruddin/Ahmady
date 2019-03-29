import java.util.Scanner;

public class Repl64 {

	public static void main(String[] args) {
		/*
		 * Prompt user to: "Please enter your birthday month number" if user enters 12,
		 * 1, 2 --> season="Winter" if user enters 3, 4, 5--> season="Spring" if user
		 * enters 6, 7, 8 --> season="Summer" if user enters 9, 10, 11--> season="Fall"
		 * if any other number--> "Please enter valid month number" and season="Unknown"
		 * 
		 * The output of the program should be : "You were born in __ "
		 */
		 int Mnum;
		   String season = "Unknown";

		   Scanner input = new Scanner(System.in);
		   System.out.println("Please enter your birthday month number");
		   Mnum = input.nextInt();

		   if(Mnum==12 || Mnum==1 || Mnum==2){
		     season = "Winter";

		   }else if (Mnum==3 || Mnum==4 || Mnum==5){
		     season = "Spring";

		   }else if(Mnum==6 || Mnum==7 || Mnum==8){
		     season = "Summer";

		   }else if (Mnum==9 || Mnum==10 || Mnum==11){
		     season = "Fall";

		   }else {
		     System.out.println("Please enter valid month number");
		   }
		   System.out.println("You were born in " + season);

		 }
		}
		
