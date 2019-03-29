import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		//Writye a program that will use a switch statement to display what day the of week.
	
		String Weekdays;
		int day;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the day of the Week");
		day=scan.nextInt();
		
		switch (day) {
		
	case 1:
        Weekdays="Saturday";
        break;
    case 2:
    	Weekdays="Sunday";
        break;
    case 3:
        Weekdays="Monday";
        break;
    case 4:
    	Weekdays="Tuesday";
    	 break;
    case 5:
    	Weekdays="Wednesday";
    	 break;
    case 6:
    	Weekdays="Thursday";
    	 break;
    case 7:
    	Weekdays="Friday";
    	 break;
    default:
    	Weekdays="Invalid";
    	break;
		}   
		System.out.println(Weekdays);
	}
}

