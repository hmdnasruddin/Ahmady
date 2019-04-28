package Method.Demo;

public class Repl128 {
	/*
	 * Create the two method with same name create one protected method in parent
	 * class write the logic as "Protected method in parent class" create same
	 * public method within the child class and extends the parent class write the
	 * logic as "public method in parent class" In main method create object with
	 * Parent class and call the parent class Method
	 */

	
protected void Repl128() {
			System.out.println("Protecte method in parent class");
	}
protected void Child() {
	System.out.println("Protecte method in child class");
}	
class Child extends Repl128 {	
}

public static void main(String []args) {
	
	Repl128 obj=new Repl128();
	Repl128 obj1=new Repl128();
	obj.Repl128();
	obj1.Child();
	
}
}

