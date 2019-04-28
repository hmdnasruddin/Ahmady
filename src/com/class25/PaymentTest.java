package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		Payment parent=new Payment();
		parent.makePayment();
		
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa visa=new Visa();
		visa.makePayment();
		visa.annualFee();
		//Achieving run time polymorphism
		//pay is the reference variable, Payment --typ
		//new CasterCard(); --creating an Object
		Payment pay=new MasterCard();
		//any method that exist in parent and common in child
		pay.closePaymetn();
		pay.makePayment();
		
		
		Payment pay1=new Visa();
		pay1.closePaymetn();
		pay1.makePayment();
		//pay1.annualFee();method is undefind
	
	}

}
