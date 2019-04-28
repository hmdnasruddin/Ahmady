package SelfPracticAbstractClass;

public abstract class Main{
	Main() {
		System.out.println("abstract method1 implementation without argument in main class");
	}

	Main(int a) {
		System.out.println("abstract method2 implementation with argument in main class");
	}
}
class Kids extends Main {
	    Kids() {
		System.out.println("abstract method2 implementation with argument in main class");
	}
}
/*
 * Method overloading is possible in abstract class create abstract class as
 * parent create two abstract methods with same name one with int parameter and
 * one without parameter but method name should be same Extends the abstract
 * class with main class Provide the implementation two methods In main method
 * by creating the object on main class with parent class instance and call
 * those two methods in the main method output abstract method1 implementation
 * without argument in main class abstract method2 implementation with argument
 * in main class
 */
