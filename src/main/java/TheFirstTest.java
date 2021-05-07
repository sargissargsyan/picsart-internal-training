import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * @author Sargis Sargsyan on 5/7/21
 * @project picsart-internal-training
 * username: tumo.test123@gmail.com
 * Password: Tumo2020!
 */
public class TheFirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ss/dev/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://picsartstage2.com/");


        WebElement loginButton = driver.findElement(By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']"));
        loginButton.click();
//        Thread.sleep(1000);
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));


        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("tumo.test123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Tumo2020!");

        WebElement signInButton = driver.findElement(By.cssSelector(".pa-uiLib-authentication-btn.primary"));
        signInButton.click();

        driver.quit();

    }
}
