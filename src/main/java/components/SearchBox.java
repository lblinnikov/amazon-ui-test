package components;

import org.openqa.selenium.*;

public class SearchBox {

	private static final String SEARCH_BOX = "//input[@id='twotabsearchtextbox']";
	private WebDriver driver;

	public SearchBox(WebDriver driver) {
		this.driver = driver;
	}

	public SearchBox clickSearchBox() {
		driver.findElement(By.xpath(SEARCH_BOX)).click();
		return this;
	}

	public void typeAndEnter(String value) {
		driver.switchTo().activeElement().sendKeys(value + Keys.ENTER);
	}
}
