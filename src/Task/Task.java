package Task;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task obj = new Task();
		String email = obj.createEmail("John", "Snow", "gmail");
		email = obj.createEmail("Bob", "Snow", "outlook");
		System.out.println(email);


	}

	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "" + emailType + ".com";
	
		return email;

	}

}
