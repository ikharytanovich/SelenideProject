package tests.playgroundui;

import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.TestsConstants.*;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.*;
import static pages.uipages.MainPage.*;

public class PlaygroundTests extends BaseTest {

    @Test(description = "locate button and click on it without using id")
    public void dynamicIdTest() {
        mainPage.goToPageByLink(DYNAMIC_ID_LINK);
        assertTrue(dynamicIdPage.isClickedOnButton());
    }

    @Test(description = "locate button and click on it with xpath")
    public void classAttributeTest() {
        mainPage.goToPageByLink(CLASS_ATTRIBUTE_LINK);
        assertTrue(classAttributePage.isClickedOnBlueButton());
    }

    @Test(description = "find green button and click on it, then check is green button covered by blue")
    public void hiddenLayersTest() {
        mainPage.goToPageByLink(HIDDEN_LAYERS_LINK);
        assertTrue(hiddenLayers.isGreenButtonHiddenUnderBlueButton());
    }

    @Test(description = "find button after load and click")
    public void loadDelayTest() {
        mainPage.goToPageByLink(LOAD_DELAY_LINK);
        assertTrue(loadDelayPage.isClickedOnButtonAfterLoad());
    }

    @Test(description = "after click on button wait for loading")
    public void aJAXDataTest() {
        mainPage.goToPageByLink(AJAX_DATA_LINK);
        assertTrue(ajaxDataPage.isClickedOnButton());
    }

    @Test(description = "find button after load and click")
    public void clientSideDelayPage() {
        mainPage.goToPageByLink(CLIENT_SITE_DELAY_LINK);
        assertTrue(clientSideDelayPage.isClickedOnButton());
    }

    @Test(description = "click on page two times")
    public void clickPageTest() {
        mainPage.goToPageByLink(CLICK_LINK);
        assertTrue(clickPage.isClickedTwoTimes());
    }

    @Test(description = "input text and check value on button")
    public void textInputTest() {
        mainPage.goToPageByLink(TEXT_INPUT_LINK);
        assertTrue(textInputPage.isInputtedTextInButton(INPUT_TEXT));
    }

    @Test(description = "scroll to bar and click")
    public void scrollbarsTest() {
        mainPage.goToPageByLink(SCROLLBARS_LINK);
        assertTrue(scrollbarsPage.isClickedOnButtonInContainer());
    }

    @Test(description = "find in table value and compare to result box")
    public void dynamicTableTest() {
        mainPage.goToPageByLink(DYNAMIC_TABLE_LINK);
        assertTrue(dynamicTablePage.isSameWithValueInYellowLabel(DYNAMIC_TABLE_HEADER_NAME, DYNAMIC_TABLE_ROW_NAME));
    }

    @Test(description = "find and verify with text in box")
    public void verifyTextTest() {
        mainPage.goToPageByLink(VERIFY_TEXT_LINK);
        assertTrue(verifyText.isTextCorrect());
    }

    @Test(description = "click on start button and when progress bar get to N percent click on stop")
    public void progressBarTest() {
        mainPage.goToPageByLink(PROGRESS_BAR_LINK);
        assertTrue(progressBarPage.isCorrectlyStoppedInNPercent(PROGRESS_BAR_VALUE));
    }

    @Test
    public void sampleAppTest() {
        mainPage.goToPageByLink(SAMPLE_APP_PAGE);
        sampleAppPage.isLoggedIn(USER_CONST, PASSWORD_CONST);
    }

    @Test
    public void mouseOverTest() {
        mainPage.goToPageByLink(MOUSE_OVER_LINK);
        assertTrue(mouseOverPage.isClickedRightTimes(TIMES_TO_CLICK));
    }

    @Test
    public void nonBreakingSpaceTest() {
        mainPage.goToPageByLink(NON_BRAKING_SPACE_LINK);
        assertTrue(nonBrakingSpacePage.isButtonClicked());
    }
}
