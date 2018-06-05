package pages;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BagPage extends Page {

	private static final String OVERALL_PRICE_X = "//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap  sc-price-sign']";
	private static final String SHOPPING_BASKET_TITLE_X = "//h2[contains(text(),'Shopping Basket')]";
	private static final String ENTITY_PRICE_X = "//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']";
	private static final String ITEM_COUNT_X = "sc-subtotal-label-activecart";


	public static class Body extends BagPage{

		public static class RightColumn extends Body {

			public static WebElement overallPrice(){
				return driver.findElement(By.xpath(OVERALL_PRICE_X));
			}

		}

		public static WebElement shoppingBasketTitle(){
			return driver.findElement(By.xpath(SHOPPING_BASKET_TITLE_X));
		}

		public static WebElement entityPrice(){
			return driver.findElement(By.xpath(ENTITY_PRICE_X));
		}

		public static WebElement itemCount(){
			return driver.findElement(By.id(ITEM_COUNT_X));
		}

	}

}
