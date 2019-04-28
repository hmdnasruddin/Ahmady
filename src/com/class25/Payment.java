package com.class25;

public class Payment {

	public void makePayment() {// overridden mehtod
		System.out.println("We can make a payment with no fee");
	}

	public void closePaymetn() {
		System.out.println("All payments needs to be closed");
	}
}

class MasterCard extends Payment {
	public void makePayment() {// overridding method
		System.out.println("We can make a payment with MC and 2%fee");

	}
}

class Visa extends Payment {
	public void makePayment() {// overridden mehtod
		System.out.println("We can make a payment with Visa and 1.5%fee");
	}

	public void annualFee() {
		System.out.println("Visa car has annual fee");
	}
}