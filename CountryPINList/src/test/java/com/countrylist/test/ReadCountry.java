package com.countrylist.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.country.repo.CountryListPage;
import com.country.utility.BrowserTypes;
import com.country.utility.DriverContext;
import com.country.utility.DriverInitialize;

public class ReadCountry extends DriverInitialize {
	
	
	
	@BeforeTest
	public void launchURL() {
		InitializeBrowser(BrowserTypes.FireFox);
		
		DriverContext.driver.get("https://countrycode.org/");
		
	}
	
	@Test
	public void readCountry() throws InterruptedException {
		CountryListPage c=new CountryListPage();
		c.launchPage();
	}

}
