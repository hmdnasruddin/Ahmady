
public class NotOperator {

	public static void main(String[] args) {
		/*
		 * not operator !
		 * 
		 */
         boolean a=!true;
         
         System.out.println("The value of boolean variable isl"+a);
         
         boolean snow=true;
         // if it is not snowing --> I will come to the class otherwise I swill syay at home
         
         if (!snow) {
        	 System.out.println("I will come to the class");
         }
         
         int x=10;
         int y=20;
         
         if (!(x>y)) {
        	 System.out.println("Hello");
         }
   }

}
