package tests;

import com.codeborne.selenide.WebDriverRunner;
import config.DriverConfig;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.BasePage;
import utils.listenerutils.TestListener;

@Listeners({TestListener.class})
public abstract class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        DriverConfig.configuration();
    }

    @BeforeTest
    public void beforeTest() {
        BasePage.openMainPage();
    }

    @AfterTest
    public void afterTest() {
        WebDriverRunner.closeWebDriver();
    }
}
