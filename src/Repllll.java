import java.util.Scanner;

public class Repllll {
	
public static void main(String[] args) {
	
	String name;int age;String mobile;
    Scanner newscan=new Scanner(System.in);
    System.out.println("Enter your name");
    name=newscan.nextLine();
    
    System.out.println("Your mobile numberr");
    mobile=newscan.nextLine();
    System.out.println("Enter your age");
    age=newscan.nextInt();
    
    System.out.println("Your name is "+name+" your age is "+age+" and your mobile number is "+mobile);
}
}