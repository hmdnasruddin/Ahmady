package OOPSConceptsInJava;

public class Computer {

	String os, brand;
	boolean mouse, keyboard;
	int screen, ram;

	public static void main(String[] args) {

		Computer comp1 = new Computer();
		comp1.os = "Windows";
		comp1.screen = 2;
		comp1.keyboard = true;
		comp1.ram = 8;

		comp1.watchMoving();
		System.out.println("My comptuer can");
		comp1.doCoding();
		comp1.canPlayMusic();

		// 2 Opject
		Computer comp2 = new Computer();
		comp2.keyboard = true;
		comp2.mouse = true;
		comp2.os = "Windows";
		comp2.ram = 6;
		comp2.screen = 4;

	}

	void watchMoving() {
		System.out.println();
	}
	
	void doCoding() {
		
	}
	void canPlayMusic() {
		
	}
}
