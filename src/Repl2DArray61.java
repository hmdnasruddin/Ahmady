
public class Repl2DArray61 {

		// Write a program that prints the highest value in the array.
		// should be 8
	int array[]= {5,2,3,7,1,5,1,1,8,3,1,2};
	
	int temp=array[0];
	
	for(int i=0; i<array.length; i++){
	  if(temp<array[i]){
	  temp=array[i];
	}
}
System.out.println(temp);

}
}
