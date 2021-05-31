package listeners;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Sargis Sargsyan on 5/27/21
 * @project picsart-internal-training
 */
public class TestListener implements ITestListener {
    private static final Logger LOGGER = Logger.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result){
        LOGGER.info("Started ----> "  + result.getMethod().getQualifiedName());
    }


    @Override
    public void onTestSuccess(ITestResult result){
        LOGGER.info("PASSED test ----> "  + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        LOGGER.info("FAILED test ----> "  + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        LOGGER.info("SKIPPED test ----> "  + result.getMethod().getQualifiedName());
    }
}
