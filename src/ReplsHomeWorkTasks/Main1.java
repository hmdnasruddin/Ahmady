package ReplsHomeWorkTasks;
public class Main1{
    
	   String name,carColor;
	   int model;
	   
		public static void main(String[] args) {
			Main1 car1 = new Main1();
			car1.carColor="Black";
			car1.name="BMW";
			car1.model=2019;
			
			Main1 car2=new Main1();
			car2.carColor="White";
			car2.model=2018;
			car2.name="Toyota";
			
			System.out.println("car color is " +car1.carColor + " and car model is " +car1.model+ "  car name is "+car1.name);
			System.out.println("car color is " +car2.carColor + " and car model is " +car2.model+ "  car name is "+car2.name);
		}
	    
	
	}

//create a class named 'Main' with specific attributes.
//For you to do
//
//Create two object in which you will be assigning the following values.
//carColor='Black'
//carModelYear=2019
//carName='BMW'
//
//carColor='White'
//carModelYear=2018
//carName='Toyota'
//
//Car color is Black and car model year is 2019 and car name is BMW
//Car color is White and car model year is 2018 and car name is Toyota