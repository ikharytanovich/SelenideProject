package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.loadDelayPage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.LOAD_DELAY_LINK;

public class LoadDelayTest extends BaseTest {
    @Test(description = "find button after load and click")
    public void loadDelayTest() {
        mainPage.goToPageByLink(LOAD_DELAY_LINK);
        assertTrue(loadDelayPage.isClickedOnButtonAfterLoad());
    }
}
