
public class ForEachLoo1 {

	public static void main(String[] args) {
		String[] countries= {"Afghanistn","Pakistan","USA","Iran","Tajikistan","Turky"};
		   for(String country:countries) {
			  
			  switch(country){
			  case"Afghanistan":
				  System.out.println("Kabul");
				  break;
			  case"Pakistan":
				  System.out.println("Islamabad");
				  break;
			  case"Iran":
				  System.out.println("Tehran");
				  break;
			  case"Tajikistan":
				  System.out.println("Doshanbeh");
			  case"Turky":
				  System.out.println("Anqara");
				  
			  }
			  
		}
	}
}
