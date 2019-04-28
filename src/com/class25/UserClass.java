package com.class25;

public class UserClass {
    
	public void study() {
		System.out.println("Student must study");
	}
	protected void doHomeWork() {
		System.out.println("Student must do Repl");
	}
	void attendClasses() {
		System.out.println("Student must attend classes");
		
	}//reating child specific private method doResearch
	private void doResearch() {
		System.out.println("Student must do research");
	}
}
