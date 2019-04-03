package SelfPractic;

public class SPractic2 {

	public static void main(String[] args) {
		
   String a="Hello";
   String b="World";
   System.out.println("Befor swapping");
   System.out.println("The value of a:"+a);
   System.out.println("The value of b:"+b);
   System.out.println(a+b);
   
   a=a+b;//HelloWorld;
   b=a.substring(a.length()-b.length());
   a=a.substring(b.length());
  
  
  
  
   
   
  
	}

}
