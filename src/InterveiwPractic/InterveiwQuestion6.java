package InterveiwPractic;

public class InterveiwQuestion6 {

	public static void main(String[] args) {
		// Write a Java program to print 10 numbers of Fiboncci series
		
		int a=1; 
		int b=0;
		int c=0;
		for(int i=0; i<10; i++) {
			 c=a+b; 
			 a=b; 
			 b=c;
			 System.out.print(a+" ");
		 }

	}

}
