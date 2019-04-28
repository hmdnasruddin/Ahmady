package Method.Demo;

public class Repl130 {

	/***
	 * create class Parent Declare two variables int a=10,int b=20;
	 * create another class Child extends Parent declared two variables int a=30,int
	 * b=40;
	 * create method in child class with parameter pass two parameters as int a,intb
	 * write the logic to perform the addition the parent variables, class variables
	 * and local variables in method use the super and this keyword for this
	 * in main method call the method which you created in the child class pass the
	 * parameters in method values as 50,60
	 * Output: 110 70 30
	 */
 class Parent{
	 int a=10;
	 int b=20;
    	 public Parent(int a, int b) {
    		 System.out.println(a+b);
	}
}
 
 class Child extends Parent{
	 
	 public Child(int a, int b) {
		super(a, b);
	}
	 int a=10;
	 int b=20;
	 }
	public void Child(int a, int b) {
	int a1=50;
	int b1=60;
		System.out.println(a+b);
	}
public static void main(String[]args) {
	
	Repl130 obj=new Repl130();
	obj.Child(60, 50);
	obj.Child(50, 20);
	obj.Child(10, 20);
	
}
}

