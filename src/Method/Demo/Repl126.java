package Method.Demo;

public class Repl126 {
	/*Create the two method with same name create one method in parent class with
	 * two int parameters and write the logic in the method to print that values
	 * (a+b) create another method in child with same name and extends the parent
	 * class with two int parameters and write the logic in the method to print that
	 * values (a+b)
	 * In main method create object with child class and call the child class Method
	 * pass the parameter values as 100, 200
	 */
	public static void main(String[] args) {
       
		A obj=new A();
		obj.A(100, 200);
	}
}
class A{
	public void A(int a, int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	public void A(int a, int b) {
		
	}
	
}
