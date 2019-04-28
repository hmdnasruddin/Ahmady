package ReplsHomeWorkTasks;

public class Repl99 {
	 public String p;
	 public String q;
	 public String misc;
    public int pricea;
    public int priceb;
    public boolean a;
    public boolean b;
	public static void main(String[] args) {
		Repl99 obj=new Repl99();
		obj.p="Eggs";
		obj.q="Produce";
		obj.pricea=3;
		obj.priceb=10;
		obj.a=true;
		obj.b=false;
		System.out.println(obj.p+" "+obj.pricea+" "+obj.q+" "+obj.a+" "+obj.b+" "+obj.priceb);
		
		Repl99 obj1=new Repl99();
		obj1.p="Paper";
		obj1.q="Towels";
		obj1.misc="misc";
		obj1.pricea=2;
		obj1.priceb=24;
		obj1.a=true;
		obj1.b=false;
	    System.out.println(obj1.p+" "+obj1.q+" "+obj1.pricea+" "+obj1.misc+" "+obj1.priceb);
	
	    Repl99 obj2=new Repl99();
		obj2.p="Paper";
		obj2.q="Towels";
		obj2.misc="null";
		obj2.pricea=2;
		obj2.priceb=0;
		obj2.a=true;
		obj2.b=false;
		System.out.println(obj2.p+" "+obj2.q+" "+obj2.pricea+" "+obj2.misc+" "+obj2.b+" "+obj2.priceb);
	}
	}
	