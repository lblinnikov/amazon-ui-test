package pages;

import org.openqa.selenium.WebDriver;
import components.Item;
import components.Results;

public class ResultPage {

	public WebDriver driver;
	public final Results results;
	public final Item item;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		this.results = new Results(driver);
		this.item = new Item(driver);
	}
}
