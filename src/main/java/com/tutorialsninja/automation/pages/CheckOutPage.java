package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckOutPage {
public   CheckOutPage() {
		
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id="button-payment-address")
	public static WebElement continueButtonofBillingDetailsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonofDeliveryDetailsSection;
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonofDeliveryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement termsAndConditionsCheckBox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonofPaymentMethodSection;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderbutton;
	
	public static void placeAnOrder() {
		Elements.click(CheckOutPage.continueButtonofBillingDetailsSection);
		Elements.click(CheckOutPage.continueButtonofDeliveryDetailsSection);
		Elements.click(CheckOutPage.continueButtonofDeliveryMethodSection);
		Elements.click(CheckOutPage.termsAndConditionsCheckBox);
		Elements.click(CheckOutPage.continueButtonofPaymentMethodSection);
		Elements.click(CheckOutPage.confirmOrderbutton);
	}

}
