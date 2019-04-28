package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver webdriver=new ChromeDriver();
		webdriver.closeBrowser();
		webdriver.findElements();
		webdriver.maximizeWindow();
		webdriver.openBrowser();
	}
}
