package Method.Demo;

 class Pa{
	 /**super method calling create class Parent declare one instance method write
	 * logic in println statement as m1 method in parent class
	 * create another class as Child extends Parent class declare two instance
	 * method in child class one method with same name as parent class method write
	 * logic in println statement as m1 method in child class create another method
	 * m2 in child class call the child class method and parent class method in this
	 * method in main method call the method which you created in the child class
	 * call the m2 method
	 * Output: m1 method in child class m1 method in parent class
	 */
	class Pa1 
	 { 
	     void Pa() 
	     { 
	         System.out.println("m1 method in parent class"); 
	     } 
	 } 
	   
	 
	 class Child extends Pa{ 
	     public void Pa() 
	     { 
	         System.out.println("m1 method in child class"); 
	     } 
	   
	     // Note that display() is only in Student class 
	     void display() 
	     { 
	         // will invoke or call current class message() method 
	         Pa(); 
	   
	         // will invoke or call parent class message() method 
	         super.toString(); 
	     } 
	 } 
	   
	 static /* Driver program to test */
	 class Test 
	 { 
	     public static void main(String args[]) 
	     { 
	         Pa obj=new Pa();
	        
	         
	         
	     }
	 }
 }
	
	        
	         
	     
	
