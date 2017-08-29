package pages;

import org.openqa.selenium.WebDriver;

import components.Bag;

public class BagPage {

	public WebDriver driver;
	public final Bag bag;

	public BagPage(WebDriver driver) {
		this.driver = driver;
		this.bag = new Bag(driver);
	}
}
