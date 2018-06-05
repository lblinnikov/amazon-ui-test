package components;

import pages.SearchResultPage;

public class SearchResults extends SearchResultPage	{

	public static void selectFirstProduct(){
		Body.firstProductPicture().click();
	}

	public static void selectProductByName(String productName){
		Body.productTitle(productName).click();
	}

}
