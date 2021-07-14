package utils.listenerutils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.loggerutils.ILogger;

import static java.lang.String.format;
import static utils.ScreenshotTaker.takeScreenshot;

public class TestListener implements ITestListener, ILogger {

    @Override
    public void onTestSuccess(ITestResult result) {
        log().info(format("TEST{%s}SUCCESS", getSimpleClassName(result)));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
        log().info(format("TEST{%s}FAILED", getSimpleClassName(result)));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        takeScreenshot();
        log().info(format("TEST{%s}SKIPPED%s", getSimpleClassName(result), result.getSkipCausedBy()));
    }

    private String getSimpleClassName(ITestResult result) {
        return result.getTestClass().getRealClass().getSimpleName();
    }
}
