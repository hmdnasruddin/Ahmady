package com.class26;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.getBalance();
		
		BankA banka=new BankA();
		banka.getBalance();
		
		BankB bankb=new BankB();
		bankb.getBalance();
		
		BankC bankc=new BankC();
		bankc.getBalance();
	}
}