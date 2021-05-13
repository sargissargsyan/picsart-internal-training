import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Sargis Sargsyan on 5/12/21
 * @project picsart-internal-training
 */
public class LoginPage extends BasePage{

    private final By usernameFieldLocation = By.name("username");
    private final By passwordFieldLocation = By.name("password");
    private final By loginButtonLocation = By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']");
    private final By signInButtonLocation = By.cssSelector(".pa-uiLib-authentication-btn.primary");
    private final By avatarLocation = By.cssSelector(".pa-uiLib-headerProfileInfo-avatar");

    public LoginPage () {
        open("https://picsart.com/");
    }

    @Override
    public String getUrl() {
        return BASE_URL;
    }

    public void clickLoginButton() {
        click(loginButtonLocation);
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usernameFieldLocation));
    }

    public void typeUsername(String username) {
        type(usernameFieldLocation, username);
    }

    public void typePassword(String password) {
        type(passwordFieldLocation,password);
    }

    public void clickSignInButton() {
        click(signInButtonLocation);
    }

    public boolean isAvatarDisplayed() {
        return find(avatarLocation).isDisplayed();
    }

    public boolean isUserLoggedIn() {
        WebElement avatarIcon = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated((avatarLocation)));
        return avatarIcon.isDisplayed();
    }
}
