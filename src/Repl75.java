import java.util.Scanner;

public class Repl75 {

	public static void main(String[] args) {
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: Your favorite car is ___
		 */
        
        String car="";
        String origin="";
        
        Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your favorit car make");
		car=scan.nextLine();
		
		switch(car)
		{
		case "BMW":
			origin="german car";
			break;
		case "Toyota":
			origin="japanes car";
			break;
		case "Maserati":
			origin="Italian car";
			break;
			default:
				System.out.println("origin unknown");
				break;
		}
		System.out.println("your favorit car is "+ origin);
		
	
	
}
}