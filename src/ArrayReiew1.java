
public class ArrayReiew1 {

	public static void main(String[]args) {
		//Write a program to sum the values of an array
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10

		int[] num=new int[10];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		num[5]=6;
		num[6]=7;
		num[7]=8;
		num[8]=9;
		num[9]=10;
		
		//System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9]+num[10]);
int sum = 0;

for(int i =0; i < 10; i++) {
	
	sum= sum + num[i];
	System.out.print(i);
		
		}
	  
       for(int a=1; a<=5; a++) {
    	   for(int b=1; b<=b; b++) {
    		   if(b!=a) {
    			   System.out.print(".");
    		   }else if (b==a) {
    			   System.out.println(a);
    		   }
    		  }
    		   System.out.println();
    	   }
       }

	}


