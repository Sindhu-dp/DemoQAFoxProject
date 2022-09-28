package com.tutorialsninja.automation.stepdef;



import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.*;


public class Orders {
	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	CheckOutPage checkOutPage = new CheckOutPage();
	OrderSuccessPage orderSuccessPage = new OrderSuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {

		Browser.openApplicationUrl();
		HeadersSection.navigateToLoginPage();
	LoginPage.doLogin();
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout() {
		HeadersSection.searchProduct() ;
		SearchResultsPage.addFirstProductInTheSearchResultsToCart();
		HeadersSection.navigateToShoppingCartPage();
	ShoppingCartPage.navigateToCheckOutPage();
	}

	@When("^I place an order$")
	public void i_place_an_order() {
		CheckOutPage.placeAnOrder();
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
	    Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.SuccessBreadCrum));
		
	}

}
