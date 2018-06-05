package pages;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PreBagPage extends Page {

    private static final String EDIT_BASKET_BTN_X = "//a[@id='hlb-view-cart-announce']";
    private static final String ADDED_TO_BASKET_X = "//h1[contains(text(),'Added to Basket')]";

    public static class Body {

        public static WebElement editBasketButton(){
            return driver.findElement(By.xpath(EDIT_BASKET_BTN_X));
        }

        public static WebElement addedToBasket(){
            return driver.findElement(By.xpath(ADDED_TO_BASKET_X));
        }

    }

}


