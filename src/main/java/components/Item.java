package components;

import pages.ItemPage;

public class Item extends ItemPage {

	public static void addToBasket() {
		Body.rightColumn.addToBasketButton().click();
	}

}
