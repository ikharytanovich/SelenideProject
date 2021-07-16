package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.dynamicIdPage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.DYNAMIC_ID_LINK;

public class DynamicIdTest extends BaseTest {
    @Test(description = "locate button and click on it without using id")
    public void dynamicIdTest() {
        mainPage.goToPageByLink(DYNAMIC_ID_LINK);
        assertTrue(dynamicIdPage.isClickedOnButton());
    }
}
