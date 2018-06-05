package components;

import pages.PreBagPage;

public class PreBag extends PreBagPage {

    public static void editBasket() {
        Body.editBasketButton().click();
    }

    public static boolean addedToBasketDisplayed() {
        return Body.addedToBasket().isDisplayed();
    }

    public static boolean editBasketButtonDisplayed() {
        return Body.editBasketButton().isDisplayed();
    }

}
