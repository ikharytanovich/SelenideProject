package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.scrollbarsPage;
import static pages.playgroundpages.MainPage.SCROLLBARS_LINK;

public class ScrollbarsTest extends BaseTest {
    @Test(description = "scroll to bar and click")
    public void scrollbarsTest() {
        mainPage.goToPageByLink(SCROLLBARS_LINK);
        assertTrue(scrollbarsPage.isClickedOnButtonInContainer());
    }
}
