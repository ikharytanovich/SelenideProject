package tests;

import com.codeborne.selenide.WebDriverRunner;
import config.DriverConfig;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.BasePage;
import utils.listenerutils.TestListener;

import static constants.TestsConstants.EMAIL_CONST;
import static constants.TestsConstants.PASSWORD_CONST;
import static pages.PageFactory.logInPage;
import static pages.PageFactory.menuBar;

@Listeners({TestListener.class})
public abstract class BaseTest {
    @BeforeTest
    public void beforeTest() {
        DriverConfig.configuration();
        BasePage.openMainPage();
        menuBar.getToLogInPage();
        logInPage.logIn(EMAIL_CONST, PASSWORD_CONST);
    }

    @AfterTest
    public void afterTest() {
        menuBar.signOut();
        WebDriverRunner.closeWebDriver();
    }
}
