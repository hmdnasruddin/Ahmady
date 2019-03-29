
public class NestedLoop {

	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			
//			for (int y=0; y<5; y++) {
//				
//				System.out.print(y);
//		System.out.println();
//	 }
//	}
//  }
//}
   /*I want to print pattern 
    * *****
    * *****
    * *****
    * *****
    */
		
		
        /*   for (int a=0; a<7; a++) {
        	   for (int b=0; b<7; b++ ) {
        		  
        	   System.out.print("*");
        	
        	  }   
       System.out.println();
           }
     }
 }*/
		
		
		/*
		 * I wan to print pattern
		 * *
		 * **
		 * ***
		 * ****
		 */
/*
         for (int c=0; c<5; c++) {
        	for(int e=0; e<5; e++) {
        		System.out.print(c);
        	}
        	System.out.println();
        	}
         }
}  */

//
         /* for (int d=0; d<5; d++) {
        	  for (int f=0; f<d; f++) {
        		 
        		  System.out.print("*");  
        	  }
        	  System.out.println();
         }
    }
}*/
		  /*
		   * I want to print ****** -> rows=4 colums =6;
		   *                 *    *
		   *                 *    *
		   *                 ******
		   *                         
		   */
		      
		    	for (int i =1; i <=4; i++) {
		    		for(int y=1; y<=6; y++) {
		    			
		    			if(i == 1 || i==4 || y==1 || y==6) {
		    				System.out.print("*");
		    			}else {
		    				System.out.print(" ");	
		    			  	  }
		    			
		    		}
			    	System.out.println();

		    	}
		    	
	}
}