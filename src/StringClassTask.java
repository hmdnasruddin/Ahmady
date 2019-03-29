import java.util.Scanner;

public class StringClassTask {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 *1 Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”.
		 *2 Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. 
		 *3 Password cannot contain username if so, →
		 * message=”Password cannot contain username”. 
		 *4 Password should match confirmed
		 * password, if not → message “Passwords do not match”. 
		 *5 Only after all requirements met → message “Your username and password has been created”
		 */ 

		Scanner scan;
		String userName, password, confirmedPassword, message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
	}
}