package actions;

import org.openqa.selenium.Keys;
import pages.MainPage;

public class SearchActions extends MainPage {

    public static void executeSearch(String keyword) {
         Header.searchBox().sendKeys(keyword);
         Header.searchButton().click();
     }

     public static void executeSearchByReturn(String keyword) {
         Header.searchBox().sendKeys(keyword, Keys.ENTER);
     }

}
