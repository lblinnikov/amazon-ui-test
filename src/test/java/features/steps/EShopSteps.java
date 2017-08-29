package features.steps;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.DriverInitializer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pages.*;

public class EShopSteps {

	private static WebDriver driver;
	private static ResultPage resultPage;
	private static ItemPage itemPage;
	private static BagPage bagPage;

	@Before
	public static void setUpClass() {
		driver = new DriverInitializer().openChromeDriver();
		driver.manage().window().maximize();
		resultPage = new ResultPage(driver);
		itemPage = new ItemPage(driver);
		bagPage = new BagPage(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@Given("^user goes to the e-shop page$")
	public void userGoesToTheEShopPage() {
		driver.get("https://www.amazon.co.uk/");
	}

	@When("^user searches (.*)$")
	public void userSearchesByKeyword(String keyword) {
	}

	@When("^user adds product (.*)$")
	public void userAddsTwoProducts(String item) {
	}

	@And("^user goes to edit basket$")
	public void userGoesToTheBasket() {
	}

	@And("^user adds one more instance of the product$")
	public void userAddsOneMoreInstanceOfTheProduct() {
	}

	@Then("^cost is correctly calculated$")
	public void costIsCorrectlyCalculated() {
	}
}
