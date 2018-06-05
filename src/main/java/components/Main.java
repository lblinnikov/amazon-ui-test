package components;

import pages.MainPage;

public class Main extends MainPage {

     public static boolean searchFormDisplayed(){
         return Header.searchBox().isDisplayed();
     }

     public static boolean searchButtonDisplayed(){
         return Header.searchButton().isDisplayed();
     }

}
