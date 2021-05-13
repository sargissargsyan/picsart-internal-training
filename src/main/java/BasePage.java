import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;

/**
 * @author Sargis Sargsyan on 5/13/21
 * @project picsart-internal-training
 */
public abstract class BasePage {
    protected WebDriver driver;
    public static final String BASE_URL="http://picsart.com";

    public BasePage() {
        this.driver = getDriver();
    }

    public abstract String getUrl();

    public void open(String url) {
        driver.get(url);
    }

    public WebElement find(By location) {
        return driver.findElement(location);
    }

    public void type(By location, String text) {
        type(find(location), text);
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void click(By location) {
        click(find(location));
    }

    public void click(WebElement element) {
        element.click();
    }

    public boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public boolean isDisplayed(By location) {
        try {
            return find(location).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
