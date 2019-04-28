package ReplsHomeWorkTasks;

public class ReplDog {
	public String dogName;
	static String dogBreed;
	public double dogWeight;
	
	public static void main(String[] args) {
		ReplDog obj=new ReplDog();
		obj.dogName="Tarzan";
		obj.dogBreed="Mutt";
		obj.dogWeight=50.0;
		
		System.out.print(obj.dogName);
		System.out.print(obj.dogBreed);
		System.out.print(obj.dogWeight);
		System.out.println();
		System.out.print(obj.dogName);
		System.out.print(obj.dogBreed);
		System.out.print(obj.dogWeight);
    	 
     }
    }