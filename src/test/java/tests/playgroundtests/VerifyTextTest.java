package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.verifyText;
import static pages.playgroundpages.MainPage.VERIFY_TEXT_LINK;

public class VerifyTextTest extends BaseTest {
    @Test(description = "find and verify with text in box")
    public void verifyTextTest() {
        mainPage.goToPageByLink(VERIFY_TEXT_LINK);
        assertTrue(verifyText.isTextCorrect());
    }
}
