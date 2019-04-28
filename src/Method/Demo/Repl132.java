package Method.Demo;

public class Repl132{
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.m2();
		
	}
}
/**
 * super method calling create class Parent declare instance method m1 saying
 * "m1 method in parent class"
 * create another class as Child extends Parent class override m1 method by
 * saying "m1 method in child class" create another method m2 in child class
 * call the child class method and parent class method in this method Test your
 * code inside Main method by creating an Object of child class
 * Output: m1 method in child class m1 method in parent class
 */
class Parent{
	void m1() {
		System.out.println("m1 method in parent class");
	}
}
class Child extends Parent{
	void m1() {
		System.out.println("m1 method in child class");
	}
	void m2() {
		this.m1();
		super.m1();
	}
}
