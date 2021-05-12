import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * @author Sargis Sargsyan on 5/7/21
 * @project picsart-internal-training
 * username: tumo.test123@gmail.com
 * Password: Tumo2020!
 */
public class TheFirstTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/ss/dev/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://picsart.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void fistTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
        loginPage.typeUsername("tumo.test123@gmail.com");
        loginPage.typePassword("Tumo2020!");
        loginPage.clickSignInButton();

        assertTrue(loginPage.isUserLoggedIn(), "User eas not logged in!");
    }
}
