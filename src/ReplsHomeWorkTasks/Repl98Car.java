package ReplsHomeWorkTasks;

public class Repl98Car {
	  public String make; 
	  public int numberOfDoors;
	  public String model;
	  public int topSpeed;
	  public double price;
	public static void main(String[] args) {
		Repl98Car obj1=new Repl98Car();
		obj1.model="Toyota";
		obj1.make="Priuse";              
		obj1.numberOfDoors=4;
		obj1.topSpeed=120;
		obj1.price=30000.0;
		System.out.print(""+obj1.model+" "+obj1.make+" "+obj1.numberOfDoors+" "+obj1.topSpeed+" "+obj1.price);
		
	    System.out.println();
		Repl98Car obj2=new Repl98Car();
		obj2.model="Toyota";
		obj2.make="Priuse";              
		obj2.numberOfDoors=4;
		obj2.topSpeed=120;
		obj2.price=30000.0;
		System.out.print(""+obj2.model+" "+obj2.make+" "+obj2.numberOfDoors+" "+obj2.topSpeed+" "+obj2.price);
		
		System.out.println();
		Repl98Car obj3=new Repl98Car();
		obj3.model="unknown";
		obj3.make="unknown";              
		obj3.numberOfDoors=4;
		obj3.topSpeed=120;
		obj3.price=30000;
		System.out.print(""+obj3.model+" "+obj3.make+" "+obj3.numberOfDoors+" "+obj3.topSpeed+" "+obj3.price);
		
		System.out.println();
		Repl98Car obj4=new Repl98Car();
		obj4.model="Toyota";
		obj4.make="Priuse";             
		obj4.numberOfDoors=4;
		obj4.price=900.0;
		System.out.print(""+obj4.model+" "+obj4.make+" "+obj4.numberOfDoors+" "+obj4.price);
	
	}

}
