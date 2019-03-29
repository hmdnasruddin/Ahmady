
public class NestedLoops{

	public static void main(String[] args) {
		
		String months[]= {"Jan", "Feb", "Mar","Apr"};
		int days[] = {31, 28, 31, 30};
		
	for (int i=0; i<=months.length; i++){
		System.out.println(months[i]);
		
		for(int j=1; j<=days[i]; j++){
			System.out.print(j+"");
		
        	}
     	}
   
	}
}
