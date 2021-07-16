package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static enums.TestsStringsConstants.PASSWORD;
import static enums.TestsStringsConstants.USER_NAME;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.sampleAppPage;
import static pages.playgroundpages.MainPage.SAMPLE_APP_PAGE;

public class SampleAppTest extends BaseTest {
    @Test(description = "input login and password in fields and login in")
    public void sampleAppTest() {
        mainPage.goToPageByLink(SAMPLE_APP_PAGE);
        sampleAppPage.isLoggedIn(USER_NAME.getValue(), PASSWORD.getValue());
    }
}
