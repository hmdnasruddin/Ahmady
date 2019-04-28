package automoile;

/***
 * Sequence of data type of arguments
 * 
 * @param variable1
 * 
 */
public class CarOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight("2", 2);
		increaseSeatHeight(8, "8");
	}

	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}

	public static void increaseSeatHeight(int variable2, String variable1) {
		System.out.println("I am the 2nd overload.");
	}
}