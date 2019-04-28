package automoile;
/***
 * Difference in data type of arguments
 * @author Nasruddin Ahmady
 *
 */
public class CarOverloading2 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("8");
	}
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat height by" +heightToIncrease+ "inches");
	}
	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increased seat height by" +heightToIncrease+ "inchs. I am the String one");
	}
}
