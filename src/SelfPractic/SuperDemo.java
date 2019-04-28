package SelfPractic;

class A{
	public A() {
		System.out.println("I am class A");
	}
	public A(String name) {
		System.out.println("I am class A with 1 parameter");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("I am class B");
	}
	public B(String name) {
		super(name);
		System.out.println("I am class B with 1 parameter");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		
		B obj1=new B("");
	
	}
}
