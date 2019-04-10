package Task;

public class AccessModifiers1 {
	
public static void main(String[] args) {
	//1-Create a method that will take 1 parameter as a String and return reversed String. 
    //Method should be visibly only within same package.
	
	AccessModifiers1 obj=new AccessModifiers1();
	String reversed=obj.reverseString("Hello");
	System.out.println(reversed);
	boolean isPalindrome=obj.isPalindrome("Hello");
	System.out.println(obj.isPalindrome("mom"));
	
	String []array=obj.getWordsFromString("Have a good night students");
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i]);
	}
	for (String word:array) {
		System.out.println(array);
	}
}

  protected String reverseString(String str) {
	  String reversed="";
	  for (int i=str.length()-1; i>=0; i--) {
		  reversed=reversed+str.charAt(i);
	  }
	  return reversed;
  }
  //2--------------------------------------------------------------------
 
  public boolean isPalindrome(String str) {
	  String reversed="";
	  boolean flag=false;
	  
	  for (int i=str.length()-1; i>=0; i--) {
		  reversed=reversed+str.charAt(i);
	  }
	  if (reversed.contentEquals(str)) {
		  return true;
		  
	  }
	  return flag;
  }
  
  //3----------------------------------------------------------------------
  //3-Create a method that will take a string and return array of words from that string. 
	      //Method should be available only within same class.
  private String [] getWordsFromString(String str) {
	 String[]words= str.split(" ");
	 return words;
	 
  }
}
