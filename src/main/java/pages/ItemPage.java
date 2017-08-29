package pages;

import components.AddToBasket;
import components.Item;
import org.openqa.selenium.WebDriver;

public class ItemPage {

	public WebDriver driver;
	public final Item item;
	public final AddToBasket addToBasket;

	public ItemPage(WebDriver driver) {
		this.driver = driver;
		this.item = new Item(driver);
		this.addToBasket = new AddToBasket(driver);
	}
}
