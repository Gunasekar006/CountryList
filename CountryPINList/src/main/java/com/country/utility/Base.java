package com.country.utility;

import org.openqa.selenium.support.PageFactory;

public abstract class Base {
	
	
	public void Base() {
		PageFactory.initElements(DriverContext.driver,this);
	}

}
