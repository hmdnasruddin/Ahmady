package com.class24;
//parent class
public class Bank {//mehtod in parent class called overidden
	
	public int chargesInterest() {
		return 0;
	}
}
  class BOA extends Bank{
	  public int chargesInterest() {
		  return 2;	  
  }
  }
  class PNC extends Bank{
	  public int chargesInterest() {
		  return 3;
	  }
  }