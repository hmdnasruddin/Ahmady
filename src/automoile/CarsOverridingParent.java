package automoile;

public class CarsOverridingParent {
	
	public void engineStart(int cyl) {//protectd method can be access from parent class to the child class
		System.out.println("I am from the parent class");
	}
	public void increaseSpeed() {
		System.out.println("I am the increase Speed from the parent class");
	}
	
	public static void staticExample() {
	 System.out.println("I am from the static method class");
	}
}
