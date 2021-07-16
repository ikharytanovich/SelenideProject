package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static enums.TestsStringsConstants.INPUT;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.textInputPage;
import static pages.playgroundpages.MainPage.TEXT_INPUT_LINK;

public class TextInputTest extends BaseTest {
    @Test(description = "input text and check value on button")
    public void textInputTest() {
        mainPage.goToPageByLink(TEXT_INPUT_LINK);
        assertTrue(textInputPage.isInputtedTextInButton(INPUT.getValue()));
    }
}
