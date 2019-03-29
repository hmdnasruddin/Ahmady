import java.util.Scanner;

public class Repl5 {

	public static void main(String[] args) {
		
		String name="Ahmad";
   
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello please enter user name");
		name=scan.nextLine();
		
		if (name==name) {
			System.out.println("Ahmad");
		}
	}

}
