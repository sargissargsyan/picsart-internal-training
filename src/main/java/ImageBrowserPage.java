import org.openqa.selenium.By;

/**
 * @author Sargis Sargsyan on 5/24/21
 * @project picsart-internal-training
 */
public class ImageBrowserPage extends BasePage {

    private final By likeIconLocation = By.cssSelector(".actions-section .notifier-hover-toggle .like");

    public ImageBrowserPage () {
    }

    public ImageBrowserPage (String imageID) {
        open(BASE_URL + "/i/" + imageID);
    }

    @Override
    public String getUrl() {
        return null;
    }

    public void clickOnLikeIcon() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(likeIconLocation);
        click(likeIconLocation);
    }

    public boolean isImageLiked() {
        return find(likeIconLocation).getAttribute("class").contains("active");
    }
}