
public class ForEachLoop {

	public static void main(String[] args) {
		int[] numbers= {12,13,14,15,16,17};
		
		//for(int monkey:numbers) {
			//System.out.print(monkey+" ");
		//}
       //Create an eate an array on integers and calculate the sum of all elements in an array.
	  
	   //String[] cars= {"BMW","Toyot","Honda","Volvo","Marsedis","Daina"};
	   //for(int i=0; i<cars.length; i++) {
		   //System.out.println(cars[i]);
		//}
      // Creat an array of countries. While retieving all values from an array print capital for each county. 
	   //(use 2 different loops.
	   
	   String[] countries= {"Afghanistn","Pakistan","USA","Iran","Tajikistan","Turky"};
	   for(int i=0; i<countries.length; i++) {
		   
		   if(countries[i]=="Afghanistan") {
			   System.out.println("Kabul");
			   if(countries[i]=="Pakistan") {
				   System.out.println("Islamabad");
				   if(countries[i]=="USA") {
					   System.out.println("Washington DC");
					   if(countries[i]=="Tajikistan");
					   if(countries[i]=="Turky") {
						   System.out.println("Stambul");
						   
					   }
				   }
			   }
			   
		   }
	   }
	}

}


