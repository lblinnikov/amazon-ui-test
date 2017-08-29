package components;

import org.openqa.selenium.WebDriver;
import core.Wait;

public class AddToBasket {

	private final WebDriver driver;
	private final Wait wait;


	public AddToBasket(WebDriver driver) {
		this.driver = driver;
		this.wait = new Wait(driver);
	}

	public void editBasket(){
	}
}
