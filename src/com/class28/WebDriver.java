package com.class28;

public interface WebDriver {
	/*
	 * Create a WebDriver Interface that will have the following unimplemented
	 * behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 * Create 2 classes that implements WebDriver interface: ChromeDriver and
	 * FirefoxDriver.
	 */
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElements();
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver is open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver is close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize window");
		
	}

	@Override
	public void findElements() {
		System.out.println("Chrome is find elements");
		
	}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Fire fox is open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox is close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox is maximize window");
		
	}

	@Override
	public void findElements() {
	System.out.println("Firefox is find elements");
		
	}
	
}
	
	
}