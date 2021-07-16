package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static enums.TestsIntegersConstants.TIMES_TO_CLICK;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.mouseOverPage;
import static pages.playgroundpages.MainPage.MOUSE_OVER_LINK;

public class MouseOverTest extends BaseTest {
    @Test(description = "click on link N times and then compare results")
    public void mouseOverTest() {
        mainPage.goToPageByLink(MOUSE_OVER_LINK);
        assertTrue(mouseOverPage.isClickedRightTimes(TIMES_TO_CLICK.getValue()));
    }
}
