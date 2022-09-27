package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ForgotpasswordPage {
	
	public ForgotpasswordPage () {
		
		PageFactory.initElements(Base.driver, this);
	}

	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(css="input[type='submit'][value='continue']")
	public static WebElement continueButton;
	
	
}
