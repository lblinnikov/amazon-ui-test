package pages;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPage extends Page {

	private static final String QTY_DROPDOWN_X = "//select[@name='quantity']";
	private static final String ADD_TO_BASKET_BTN_X = "//input[@value='Add to Basket']";

	public static class Body {

		public static class rightColumn {

			public static WebElement addToBasketButton(){
				return driver.findElement(By.xpath(ADD_TO_BASKET_BTN_X));
			}

			public static WebElement quantityDropdown(){
				return driver.findElement(By.xpath(QTY_DROPDOWN_X));
			}

		}

	}

}
