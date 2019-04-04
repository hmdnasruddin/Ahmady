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
       System.out.println("My computer "  +comp1.os+  " os " +comp1.ram+ " ram "+"has 2 inch"+comp1.screen+" screen"+"has"+comp1.keyboard+ " keyboard");
		
		System.out.println();
		comp1.doCoding();
		comp1.watchMovie();
        comp1.canPlayMusic();
        comp1.canColculate();
        
        
		// 2 Opject
		Computer comp2 = new Computer();
		comp2.keyboard = true;
		comp2.mouse = true;
		comp2.os = "Windows";
		comp2.ram = 6;
		comp2.screen = 4;

	}

	void watchMovie() {
		System.out.println("My comptuer can do watchMovie");
	}
	
	void doCoding() {
		System.out.println("My computer can doCoding");
		
	}
	void canPlayMusic() {
		System.out.println("My computer canPlayMusice");
	
	}
	void canColculate() {
		System.out.println("My computer canColculate");
}
}
