package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

    public static WebDriver driver = null;

    private static final String BASE_URL = "https://www.amazon.co.uk/";
    private static final String CHRM_DRVR_PTY = "webdriver.chrome.driver";
    private static final String CHRM_DRVR_PTH = "C:\\Users\\levs.blinnikovs\\IdeaProjects\\cmc-testing\\cmc-automation\\src\\main\\resources\\chromedriver.exe";

    public static void setUpDriverClass() {
        System.setProperty(CHRM_DRVR_PTY, CHRM_DRVR_PTH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        driver.close();
        driver.quit();
    }

    public static void getBaseUrl() {
        driver.get(BASE_URL);
    }

}
