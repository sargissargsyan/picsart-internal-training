import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;

import static setup.DriverSetup.getDriver;

/**
 * @author Sargis Sargsyan on 5/24/21
 * @project picsart-internal-training
 */
public class ImageBrowserPage extends BasePage {

    @FindBy(css = ".actions-section .notifier-hover-toggle .like")
    public WebElement likeIcon;
//
//    public ImageBrowserPage () {
//        PageFactory.initElements(getDriver(), ImageBrowserPage.class);
//    }

    public void open() {
        open(getUrl());
    }

    public ImageBrowserPage (String imageID) {
        open(BASE_URL + "/i/" + imageID);
        PageFactory.initElements(getDriver(), this);

    }

    @Override
    public String getUrl() {
        return null;
    }



    public void clickOnLikeIcon() {
        click(likeIcon);
    }

    public boolean isImageLiked() {
        return likeIcon.getAttribute("class").contains("active");
    }

    public void clickLike() {
        click(likeIcon);
    }
}