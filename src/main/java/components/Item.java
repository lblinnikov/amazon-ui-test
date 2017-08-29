package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Item {

	private WebDriver driver;

	public Item(WebDriver driver) {
		this.driver = driver;
	}

	public void assertItemSelected(String value){
	}

	public AddToBasket addToTheBag() {
	}
}
