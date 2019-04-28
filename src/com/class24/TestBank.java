package com.class24;

public class TestBank {

	public static void main(String[] args) {
		Bank bank=new Bank();
		BOA boa=new BOA();
		PNC pnc=new PNC();
		
		int interestRate;
		
        interestRate=bank.chargesInterest();
        interestRate=boa.chargesInterest();
        interestRate=pnc.chargesInterest();
        
        System.out.println("Bank charges rate="+interestRate);
        System.out.println("BOA charges rate="+interestRate);
        System.out.println("PNC charges rate ="+interestRate);
}
}