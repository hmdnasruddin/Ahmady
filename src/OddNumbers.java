
public class OddNumbers {

	public static void main(String[] args) {
		
		
		int num=1;
		while(num<=20) {
			//System.out.println("I am inside while loop");
			
			if (num% 2 !=0) {
				System.out.println(num);
			}
				num++;
	
           /*
            * printg only even numbers from 10 -100
            */
		}
		
		int num1=10;
		while (10<=100) {
		System.out.println(num1);
			num1++;
			/*create a boolean vriable workDay and assign true
			 * create int variable day and assign it to 1
			 * as long as it is workDay print --> "I need a day off" and increment day
			 * day once day is 6 --> your condition for yur loop should becone false
			 */
			
			boolean workDay=true;
			int day=1;
			while (workDay)
			System.out.println("I need a day off");
			
			if (day==6) {
				System.out.println("I do not need day off ");
				workDay=false;
			}
			
			day++;
				
		   
		   }
		}
	}
		


