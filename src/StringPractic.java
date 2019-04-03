
public class StringPractic {

	public static void main(String[] args) {
		//Firs way to create string
		  String str="Hello world";
		
		//Second way to create string
		  String s1=new String("HelloWord");
		
		  String str2="Syntax";
		
		
		  int String=str2.length(); int lengthOfstring=str2.length();
		   System.out.println(lengthOfstring);
		 
		
		
		  String str1="Syntax Technologies";
		  
		  String str3="Afghanistan";
		  System.out.println(str3.length());
		  
		    String str4="Hello"; 
		  
		    String newString=str4.toLowerCase();
		    System.out.println(newString);
		    String lowerCaseString=str3.toLowerCase();
		    System.out.println(lowerCaseString);
		 
		  //equals() - compares 2 strings, if strings are equal--> true, else -->fals
	       
		  String str6="hello"; 
		  String str5="Hello";
		  boolean equlity=str6.contains(str5);
		  System.out.println(equlity);
		  
		
		  // equalsIgnoreCase() - compares 2 strings but ignores case String
		 String expectedBrowser="Chrome"; String actualBrowser="CHROME";
		 boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		 System.out.println(equals);
		  

	}

}
