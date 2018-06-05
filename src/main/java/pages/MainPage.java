package pages;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {

	private static final String SRC_BOX_X = "//input[@id='twotabsearchtextbox']";
	private static final String SRC_BTN_X = "//input[@class='nav-input'][@value='Go']";

	public static class Header extends MainPage {

		public static WebElement searchBox() {
			return driver.findElement(By.xpath(SRC_BOX_X));
		}

		public static WebElement searchButton() {
			return driver.findElement(By.xpath(SRC_BTN_X));
		}

	}

}






