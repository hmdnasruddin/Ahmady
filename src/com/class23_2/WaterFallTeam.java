package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee{
	
	
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary1=90000;// protected  numbers can access from different package through inkeritance ONLY
		                 //default values cannot be access in different package
		
		wt.test();//available because it's protected
		//wt.test1();// is not available becaust it's defualt
	}
	

}
