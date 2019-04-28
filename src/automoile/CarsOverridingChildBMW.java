package automoile;
/***
 * Rules
 * 1. Arguments Lists: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of fth e overriding cehtod dcannot be more restrictive than the overriden method
 * 3. private, static and final methoos cannot be overriden as they are local to the class
 */
public class CarsOverridingChildBMW extends CarsOverridingParent{

	public static void main(String[] args) {
		CarsOverridingParent cl = new CarsOverridingChildBMW();
		cl.increaseSpeed();
		cl.engineStart(2);
		
	}
	@Override
	public void engineStart(int cyl) {
		//super.engineStart(2);
		System.out.println("I am from the child class");
	}
	public static void staticExample() {
		 System.out.println("I am from the static method class");
		}
}
