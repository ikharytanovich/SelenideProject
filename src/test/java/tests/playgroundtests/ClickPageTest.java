package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.clickPage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.CLICK_LINK;

public class ClickPageTest extends BaseTest {
    @Test(description = "click on page two times")
    public void clickPageTest() {
        mainPage.goToPageByLink(CLICK_LINK);
        assertTrue(clickPage.isClickedTwoTimes());
    }
}
