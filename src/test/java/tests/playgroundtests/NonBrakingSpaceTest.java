package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.nonBrakingSpacePage;
import static pages.playgroundpages.MainPage.NON_BRAKING_SPACE_LINK;

public class NonBrakingSpaceTest extends BaseTest {
    @Test(description = "find element that contains non-braking space and click on it")
    public void nonBreakingSpaceTest() {
        mainPage.goToPageByLink(NON_BRAKING_SPACE_LINK);
        assertTrue(nonBrakingSpacePage.isButtonClicked());
    }
}
