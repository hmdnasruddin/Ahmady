import java.util.*;

public class ScannerAndIf {
	/*Ask user to enter city and temperature in Fahernhit
	 * Your program should convert F-->C
	 * Your program should say "The temperature in the city ---is ---"
	 */
public static void main(String[] args) {
	
String cityName;
int temp;

Scanner myScanner=new Scanner(System.in);

System.out.println("Please enter city");
cityName=myScanner.nextLine();

System.out.println("Please enter tempereture in Fehrenhiet");
temp=myScanner.nextInt();
//formola (F-32)*5/9;

int convertedTemp=(temp-32)*5/9;
System.out.println("The temperature in the city"+cityName+" is "+convertedTemp+" C");

//
int month =12;

Scanner myScanner1=new Scanner(System.in);
System.out.println("January");
month=myScanner1.nextInt();

Scanner Scanner =new Scanner(System.in);
System.out.println("February");
month=myScanner1.nextInt();

  if (month==1){
    System.out.println("January");
    
    if (month==2){
      System.out.println("February");
      
    }else {
    System.out.println("Not valud");
    }
    
  }
}



  














	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
}
