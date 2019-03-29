
public class Recaps {

	public static void main(String[] args) {
		// let's creat an array of names  that hold 5 elements and retrieve allvalues from it
		
		 String[] names=new String[5];
		 
		 names[0]="Asel";
		 names[1]="Awet";
		 names[2]="Arif";
		 names[3]="Weqas";
		 names[4]="Dzmitri";
		 names[5]="Shiva";//will get an runtime exeption when trying to access it
				 
       for(int j=0; j<names.length; j++) {
       System.out.println(names[j]);
	}
       //2. crate an array using array literal
	
	String[] studentNames= {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
	System.out.println("--------For Loop");
	for(int i=0; i<=studentNames.length-1; i++) {
		System.out.println(studentNames[i]);
		
	}
	    // retrieve values using: advanced for loop, for each enhaved for loop
	System.out.println("--------Advanced for Loop ------");
	for (String student : studentNames) {
		System.out.println(student);
		}
	}
}
