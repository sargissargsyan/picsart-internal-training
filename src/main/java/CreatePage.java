import org.openqa.selenium.By;

/**
 * @author Sargis Sargsyan on 5/20/21
 * @project picsart-internal-training
 */
public class CreatePage extends BasePage {
    private By uploadButtonLocation = By.cssSelector("[class*='uploadButton'] input");

    @Override
    public String getUrl() {
        return BASE_URL + "/create";
    }

    public void open() {
        open(getUrl());
    }

    public void uploadPhoto() {
//        WaitHelper.getInstance().waitForElementToBeDisplayed(uploadButtonLocation);
        type(uploadButtonLocation, "/Users/ss/dev/picsart-internal-training/src/main/resources/photo.png");
    }
}
