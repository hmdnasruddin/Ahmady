package OOPSConceptsInJava;

public class Phone {
	
	//1. Create a Class "Phone". Ceate 3 Objects of it: iPhone, Android, Nokia with
	//specific attributes and behaviors.
	
	String brand;
	int mamory,screen;
	boolean headphone,loupSeacker,battry,semcard, chargable;
	
	public static void main(String[]args) {
		//ClassName variable=new ClassName();
		
		Phone ph1=new Phone();
		ph1.battry=true;
		ph1.headphone=true;
		ph1.mamory=20;
		ph1.screen=4;
		ph1.brand="iPhone";
		ph1.chargable=true;
		
		System.out.println("My phone has a battry "+ph1.battry+ " has a headphone"+ph1.headphone+"has mamory "+ph1.mamory+ "has screen "+ph1.screen+ "brand is "+ph1.brand+ "battry is "+ph1.chargable);
		//difine behavior;
		ph1.canCallAnyWhere();
		ph1.canCallAnyWhere();
		ph1.canPlayMusice();
		ph1.canText();
	}
    void canCallAnyWhere() {
    	System.out.println("My Phone can call any where");
    	
    }
    void canPlayMusice() {
    	System.out.println("My phone can pla musice");
    }
    void canText() {
    	System.out.println("My phone can text");
    	
    }
    void canPlayGame() {
    	System.out.println("My phone can play game");
    	
    	
    }
}
