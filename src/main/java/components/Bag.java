package components;

import pages.BagPage;

public class Bag extends BagPage {

    public static int getItemCount() {
        return Integer.parseInt(Body.itemCount().getText().substring(10, 11));
    }

    public static double getOverallPrice() {
        return Double.parseDouble(Body.RightColumn.overallPrice().getText().substring(1));
    }

    public static double getEntityPrice() {
        return Double.parseDouble(Body.entityPrice().getText().substring(1));
    }

    public static boolean shoppingBasketTitleDisplayed() {
        return Body.shoppingBasketTitle().isDisplayed();
    }

    public static boolean priceCalculatedCorrectly(){
        int itemCount = getItemCount();
        double priceOverall = getOverallPrice();
        double priceEntity = getEntityPrice();
        return (priceOverall==itemCount*priceEntity);
    }

}
