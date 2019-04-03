package InterveiwPractic;

public class InterveiwQuestion3 {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?
		
		String sentence="The master is speaking";
		String reverse="";
		for(int i=sentence.length()-1; i>=0; i--) {
			reverse=reverse+sentence.charAt(i);
		}

	}

}
