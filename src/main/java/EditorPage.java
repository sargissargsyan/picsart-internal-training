import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static setup.DriverSetup.getDriver;

/**
 * @author Sargis Sargsyan on 5/17/21
 * @project picsart-internal-training
 */
public class EditorPage extends BasePage {

    @FindBy(css = "[data-test='insta-story']")
    private WebElement instagramStory;

    @FindBy(css = "[class*='customSizeContainer']")
    private List<WebElement> editorItems;

    @FindBy(id = "background-category")
    private WebElement fitIconItem;


    public EditorPage() {
        open(getUrl());
        PageFactory.initElements(getDriver(), this);
    }

    public EditorPage init() {
        PageFactory.initElements(getDriver(), this);
        return this;
    }

    @Override
    public String getUrl() {
        return BASE_URL + "/create";
    }

    public int getItemsCount() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(editorItems.get(0));
        return editorItems.size();

    }

    public void clickInstagramStory() {
//        WaitHelper.getInstance().waitForElementToBeDisplayed(instagramStory);
        Actions actions = new Actions(driver);
        actions.moveToElement(instagramStory).click().build().perform();
    }

    public void clickFitIcon() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(fitIconItem);
        click(fitIconItem);
    }
}
