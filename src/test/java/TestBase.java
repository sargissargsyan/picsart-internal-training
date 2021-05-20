import org.testng.annotations.AfterMethod;

import static setup.DriverSetup.getDriver;

/**
 * @author Sargis Sargsyan on 5/20/21
 * @project picsart-internal-training
 */
public class TestBase {

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
