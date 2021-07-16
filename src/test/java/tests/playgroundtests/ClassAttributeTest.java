package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.classAttributePage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.CLASS_ATTRIBUTE_LINK;

public class ClassAttributeTest extends BaseTest {
    @Test(description = "locate button and click on it with xpath")
    public void classAttributeTest() {
        mainPage.goToPageByLink(CLASS_ATTRIBUTE_LINK);
        assertTrue(classAttributePage.isClickedOnBlueButton());
    }
}
