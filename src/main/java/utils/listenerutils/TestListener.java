package utils.listenerutils;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.loggerutils.ILogger;

public class TestListener implements ITestListener, ILogger {

    @Override
    public void onTestSuccess(ITestResult result) {
        log().info("TEST{" + getSimpleClassName(result) + "}SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
        log().info("TEST{" + getSimpleClassName(result) + "}FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        takeScreenshot();
        log().info("TEST{" + getSimpleClassName(result) + "}SKIPPED" + result.getSkipCausedBy());
    }

    @Attachment(type = "image/png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }


    private String getSimpleClassName(ITestResult result) {
        return result.getTestClass().getRealClass().getSimpleName();
    }
}
