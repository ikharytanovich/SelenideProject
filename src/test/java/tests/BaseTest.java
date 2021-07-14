package tests;

import com.codeborne.selenide.WebDriverRunner;
import config.DriverConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.BasePage;
import utils.listenerutils.TestListener;

@Listeners({TestListener.class})
public abstract class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        DriverConfig.configuration();
    }

    @BeforeMethod
    public void beforeMethod() {
        BasePage.openMainPage();
    }

    @AfterMethod
    public void afterMethod() {
        WebDriverRunner.closeWebDriver();
    }
}
