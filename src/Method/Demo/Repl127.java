package Method.Demo;

public class Repl127 {

	public static void Parent() {
		 System.out.println("method in Parent class");
	 }
	public static void Child() {
		System.out.println("method in Child class");
	}
	
	public static void main(String[] args) {
		/*Create a default method in parent class saying "method in Parent class" that
		 * will be overridden from the child class saying "method in Child class" In
		 * main class achieve run time polymorphism.
		 */
		Repl127 obj=new Repl127();
		Repl127 obj1=new Repl127();
		obj.Parent();
		obj1.Child();
	}
}
