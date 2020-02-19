package com.country.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialize  {

	public WebDriver InitializeBrowser(BrowserTypes type) {

		WebDriver driver = null;
		switch (type) {
		case Chrome: 
			//System.setProperty(key, value)
			DriverContext.driver = new ChromeDriver();
			break;
		
		case FireFox: 
			// Open the browser
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\gkumarasamy\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			DriverContext.driver = new FirefoxDriver();
			break;
		
		case IE: 
			System.out.println("IE Driver not configured");
			break;
		
		}
		
		return DriverContext.driver;
	}
}
