package pages;

import org.openqa.selenium.WebDriver;

import components.SearchBox;

public class MainPage {

	public WebDriver driver;
	public final SearchBox searchBox;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		this.searchBox = new SearchBox(driver);
	}
}
