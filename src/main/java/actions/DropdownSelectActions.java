package actions;

import common.Page;
import org.openqa.selenium.support.ui.Select;
import pages.ItemPage;

public class DropdownSelectActions extends Page {

    public static Select select = null;

    public static void selectOneMoreProduct() {
        select = new Select(ItemPage.Body.rightColumn.quantityDropdown());
        select.selectByVisibleText("2");
    }

}
