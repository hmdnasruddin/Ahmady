package Method.Demo;

public class Main{
	   
	public static void main(String[] args) {
		
			/***
			 * Create the two static method with same name create one method in parent class
			 * write the logic as "Parent m1()" create another method with same in the child
			 * class Write the logic "Child m1()" In main method create object with child
			 * class and call the child class Method output would Child m1()
			 */
		 Main obj=new Main();
		 obj.Main11();
			
			}
		public static void Main(){
				System.out.println("Parent m1");
			}
		public static void Main11(){
				System.out.println("Child m1");
			}
		}

	

