
public class StringManipulation {

	public static void main(String[] args) {
		String str="Good morning, student!";
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		String present="Welcome, Mehmet";
		String nedeedValue="Welcome";
				
		boolean flag=present.contains(nedeedValue);
		System.out.println(flag);
		
		//
		String str1="syntax";
		System.out.println("---------StartsWith-------");
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("x"));
		
		//
		System.out.println("-------isEmpty-------");
		String str2="";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		//
		System.out.println("-------concat-------");
		String str3="Hello";
		String str4="Ali!";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//trim()--> wil remove space at the beganning and at the end of contains
		System.out.println("--------__---------");
		String expected="You may qulify for a multi-policy discount!";
		String actual="You may qulify for a multi-policy discount!";
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
	

	}

}
