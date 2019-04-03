package ReplsHomeWorkTasks;

public class ReplStringMethod70 {

	public static void main(String[] args) {
		/*Print out the position of the first occurrence of "c"
          Print out the position of the first occurrence of " "
          Print out the position of the first occurrence of the variable target1
          Print out the position of the first occurrence of the variable target2*/ 

		String str4 = "abracadabra alakazam";
		   int index1=str4.indexOf("c");
		   System.out.println(index1);
		   int index4=str4.indexOf(" ");
		   System.out.println(index4);
		    int index2=str4.indexOf("d");
		    System.out.println(index2);
		    String target2 = "ABRA";
		    int index3=target2.indexOf("a");
		    System.out.println(index3);
	}

}
