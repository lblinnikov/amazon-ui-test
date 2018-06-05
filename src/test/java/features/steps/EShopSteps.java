package features.steps;

import actions.DropdownSelectActions;
import actions.SearchActions;
import components.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import common.Page;

import static org.junit.Assert.*;

public class EShopSteps extends Page{

	@Before
	public static void setUp(){
		Page.setUpDriverClass();
	}

	@Given("^user goes to the e-shop page$")
	public void userGoesToTheEShopPage() {
		Page.getBaseUrl();
	}

	@When("^user searches (.*)$")
	public void userSearchesByKeywordClick(String keys) {
		assertTrue("Search form not displayed!", Main.searchFormDisplayed());
		assertTrue("Search button not displayed!", Main.searchButtonDisplayed());
		SearchActions.executeSearch(keys);
	}

	@When("^user presses RETURN after searching (.*)$")
	public void userSearchesByKeywordAndReturn(String keys) {
		assertTrue("Search form not displayed!", Main.searchFormDisplayed());
		SearchActions.executeSearchByReturn(keys);
	}

	@When("^user adds first product$")
	public void userAddsFirstProduct() {
		SearchResults.selectFirstProduct();
		Item.addToBasket();
		assertTrue("Added to basket notification not displayed!", PreBag.addedToBasketDisplayed());
	}

	@When("^user adds product named (.*)$")
	public void userAddsProductByName(String productName) {
		SearchResults.selectProductByName(productName);
		Item.addToBasket();
		assertTrue("Added to basket notification not displayed!", PreBag.addedToBasketDisplayed());
	}

	@And("^user goes to edit basket$")
	public void userGoesToTheBasket() {
		assertTrue("No Edit Basket button to click!", PreBag.editBasketButtonDisplayed());
		PreBag.editBasket();
		assertTrue("Not in shopping basket!", Bag.shoppingBasketTitleDisplayed());
	}

	@And("^user adds one more instance of the product$")
	public void userAddsOneMoreInstanceOfTheProduct() {
		assertTrue("Not in shopping basket!", Bag.shoppingBasketTitleDisplayed());
		DropdownSelectActions.selectOneMoreProduct();


	}

	@Then("^cost is correctly calculated$")
	public void costIsCorrectlyCalculated() throws InterruptedException {
		Thread.sleep(2000);
		Bag.priceCalculatedCorrectly();
		assertTrue("Cost calculated incorrectly!", Bag.priceCalculatedCorrectly());
	}

	@After
	public static void closeBrowser(){
		Page.tearDown();
	}
}
