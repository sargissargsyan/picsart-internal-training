import com.google.gson.JsonObject;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static setup.DriverSetup.getDriver;

/**
 * @author Sargis Sargsyan on 5/24/21
 * @project picsart-internal-training
 */
public class LikeTest {
    private String key;

    @BeforeMethod
    public void setup() throws IOException {
        JsonObject user = ApiHelper.createUser();
        key = user.get("response").getAsJsonObject().get("key").getAsString();
        LoginPage loginPage = new LoginPage();

        Cookie cookie = new Cookie("user_key", key);
        getDriver().manage().addCookie(cookie);
        getDriver().navigate().refresh();

    }
    @Test
    public void like() throws IOException {
        JsonObject image = ApiHelper.uploadPhoto(key);
        ApiHelper.likePhoto(key, image.get("id").getAsString());
        ImageBrowserPage imageBrowserPage = new ImageBrowserPage(image.get("id").getAsString());
        imageBrowserPage.clickLike();
    }


}
