
public class DemintioalTask {

	public static void main(String[] args) {
		/*Create a 2D array where you will store the following values: 
		 Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
         After storing values print the following:
         Mrs Smith, Mr Obama, Ms Jackson.
         2.Create a 2D array that first row will contain 4 names and second row
         will contain grades. Then you program should print name of the students
         that has as an A and B grade*/
		
        
        String[][] food= {
        		{"burger", "fries", "hot dog", "meatloaf"},//1 array or 1 row
                {"lo mein", "fried rice"},
                {"biriyani", "korma", "naan", "chick peas"}
        };
        
        for(int i=0; i<food.length; i++) {
        	for(int k=0; k<food[i].length; k++) {
        		System.out.print(food[i][k]+ " ");
        	}
        	System.out.println();
        }
	}
}



