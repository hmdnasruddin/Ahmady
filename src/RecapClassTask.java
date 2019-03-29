
public class RecapClassTask {

	public static void main(String[] args) {
		/* Create a grocery list: fruits{}
		 *                       Vegiies{}
		 *                         dairy{}
		 * Retrive all values using 2 different loops                        
		 */
		                         
     String[][] groceryList= {
    		 {"Apple","Banana","Greps"},
    		 {"Patao","Onion","Tomato"},
    		 {"Butter","Yogort","Chees"}
    		 };
     
       for(String[] list:groceryList) {
    	   for(String item:list) {
    		   System.out.println(item);
    	   }
       }
       
	}
}

