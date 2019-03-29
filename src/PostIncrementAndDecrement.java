
public class PostIncrementAndDecrement {

	public static void main(String[] args) {
		// past incrremetn & post decrement
		//a++;  
		// a--;
		int a=299;
		int b=a++;  //frst assign --> increment (int b=a; a=a+1)
		System.out.println(a);//300
		System.out.println(b);//299
		
		//post decrement x--;
		
		int z=10;
		int c=z--;
		
		System.out.println(z);//9
		System.out.println(c);//10
		
		

	}

}
