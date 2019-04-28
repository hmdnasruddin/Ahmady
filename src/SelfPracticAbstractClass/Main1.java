package SelfPracticAbstractClass;

abstract class Main1 {

	public void day() {
		System.out.println("abstract method1 implementation in main class");
	}

	public void day1() {
		System.out.println("abstract method2 implementation in main class");
	}

	public abstract void day2();

	public abstract void day3();

}

class Child extends Main1 {

	@Override
	public void day2() {
		System.out.println("abstract method1 implementation in main class");

	}

	@Override
	public void day3() {
		System.out.println("abstract method2 implementation in main class");

	}

public static void main(String[] args) {
		Main1 obj=new Child();
		obj.day();
		obj.day1();
		obj.day2();
	}
}


