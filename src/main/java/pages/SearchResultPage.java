package pages;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends Page {

	private static final String FIRST_ELEMENT_PICTURE_X = "(//a[@class='aok-block aok-nowrap aok-hide-text acs_product-image'])[1]";
	private static final String H2_X_PREFIX = "//h2[contains(text(),'";
	private static final String H2_X_POSTFIX = "')]";

	public static class Body {

		public static WebElement firstProductPicture() {
			return driver.findElement(By.xpath(FIRST_ELEMENT_PICTURE_X));
		}

		public static WebElement productTitle(String productName) {
			return driver.findElement(By.xpath(H2_X_PREFIX + productName + H2_X_POSTFIX));
		}

	}

}


