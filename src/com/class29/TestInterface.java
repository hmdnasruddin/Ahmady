package com.class29;

public class TestInterface {

	public static void main(String[] args) {
		ChromeDriver obj1=new ChromeDriver();
		obj1.closeBrowser();
		obj1.execute();
		obj1.findElement();
		obj1.getReport();
		obj1.m2();
		obj1.openBrowser();
		obj1.refreshBrowser();
		obj1.takesScreenShot();
		
		System.out.println("-------------Firfox Objects----------");
		FirefoxDriver obj2=new FirefoxDriver();
		obj2.closeBrowser();
		obj2.findElement();
		obj2.getReport();
		obj2.m2();
		obj2.refreshBrowser();
		obj2.takesScreenShot();
		
	}
}
