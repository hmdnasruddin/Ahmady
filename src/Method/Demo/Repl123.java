package Method.Demo;

public class Repl123 {
	/***
	 * Create the two Constructor with different parameters and try to call them in
	 * main method create one method without parameter create another method with
	 * String parameter. 
	 * output would
	 * Welcome to the syntax solutions
	 *  I am the student in syntax solutions
	 */
	public static void main(String[] args) {
		Welcometothesyntaxsolutions();
		Iamthestudentinsyntaxsolutions((null)); 
	}
   public static void Welcometothesyntaxsolutions() {
	   System.out.println("Welcome to the syntax solution");
   }
   public static void Iamthestudentinsyntaxsolutions(String a) {
	   String Iamthestudentinsyntaxsolutions="";
	   System.out.println("I am the student in syntax solution");
   }
}
