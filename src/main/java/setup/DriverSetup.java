package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sargis Sargsyan on 5/13/21
 * @project picsart-internal-training
 */
public class DriverSetup {
    public static WebDriver driver;
    private static ChromeOptions options;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            options = new ChromeOptions();
            List<String> arguments = new ArrayList<>();
            arguments.add("--disable-notifications");
//            arguments.add("--kiosk");
//            arguments.add("--window-size=600,800");
            options.addArguments(arguments);

            driver = new ChromeDriver(options);
        }
        return driver;
    }

}
