package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sargis Sargsyan on 5/13/21
 * @project picsart-internal-training
 */
public class DriverSetup {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/ss/dev/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

}
