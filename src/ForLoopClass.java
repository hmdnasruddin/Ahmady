
public class ForLoopClass {

	public static void main(String[] args) {
		
		//initialize condition/tesCondition/ increment/decrement
		for (int i=0;i<=10;i++) {
			System.out.println("Good morning"+i);
			
		
	}
		/* Iwant print numbers from 10 to*/
		 
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		/*What is the output?*/
		
		for (int a=0; a<=20; a+=2) {
			System.out.println(a);
		}
		
		//
		for (int b=1; b<=50; b+=7) {
			System.out.println(b);
			
			
			/*1 Print numbers from 1 to 100*/
			
			for(int a=1; a<100; a+=1) {
				System.out.println(a);
				/*2 Print numbers from 100 to 1*/
				
			for(int c=100; c>=1; c--) {
				System.out.println(c);
			}		
			/*3 Print odd numbers between 20 and 50 (2 way) */	
			}
			
			for (int a=20; a<=50; a++) {
				if (a%2==1)
				System.out.println(a);
				//
				for (int k=50; k>=20; k--) {
					if(k%2==0)
				System.out.println(k);	
			
				}
				
			}
		}
	}

}
