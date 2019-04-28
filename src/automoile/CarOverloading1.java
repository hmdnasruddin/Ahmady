package automoile;
/***
 * Defferent Nuber of parameters in agument list
 * @author Nasruddin Ahmady
 *
 */
public class CarOverloading1 {
    //1.Number of parameter could be deffirent
	//2. Data type of parameters are deffirent
	//3. Sequence of data type is defferrent
	
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat height by" +heightToIncrease+ "inches");
	}
	
	public static void increaseSeatHeight(int heghtToIncrease, boolean rememberHeight) {
		System.out.println("Increased seat height by" +heghtToIncrease+ "inches");
		if (rememberHeight) {
			System.out.println("Your selection is saved");
		}else {
			System.out.println("Your selection is not saved");
		}
	}

}

