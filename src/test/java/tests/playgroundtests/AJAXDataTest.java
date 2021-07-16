package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.ajaxDataPage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.AJAX_DATA_LINK;

public class AJAXDataTest extends BaseTest {
    @Test(description = "after click on button wait for loading")
    public void aJAXDataTest() {
        mainPage.goToPageByLink(AJAX_DATA_LINK);
        assertTrue(ajaxDataPage.isClickedOnButton());
    }
}
