package com.class28;

public interface Bank {

	static String name = "Bank";// by default all variables inside the interface are public satatic final
								// we cannot have instance members (variables and method)
	String hello = "hi";// by default it will be public static final

	// by default compiler adds public and abstract to every method
	void hasChecking();

	void hasSaving();

	void hasCreditCard();
	// static hasLoan(); cannot have static abstract method
}

class BOA implements Bank {
	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking account");
	}

	@Override
	public void hasSaving() {
		System.out.println("BOA has 2 savings account");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different account");
	}

	class PNC implements Bank {
		@Override
		public void hasChecking() {
			System.out.println("PNC has 3 checking account");
		}

		@Override
		public void hasSaving() {
			System.out.println("PNC has 2 saving account");
		}

		@Override
		public void hasCreditCard() {
			System.out.println("PNC has 3 checking account");
		}
	}

}