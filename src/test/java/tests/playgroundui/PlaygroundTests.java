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
        assertTrue(dynamicIdPage.clickOnButton());
    }

    @Test(description = "find button and click on it with xpath")
    public void classAttributeTest() {
        mainPage.goToPageByLink(CLASS_ATTRIBUTE_LINK);
        assertTrue(classAttributePage.clickObBlueButton());
    }

    @Test(description = "find green button and click on it, then check is green button covered by blue")
    public void hiddenLayersTest() {
        mainPage.goToPageByLink(HIDDEN_LAYERS_LINK);
        assertTrue(hiddenLayers.isGreenButtonHiddenUnderBlueButton());
    }

    @Test
    public void loadDelayTest() {
        mainPage.goToPageByLink(LOAD_DELAY_LINK);
        assertTrue(loadDelayPage.clickOnButtonAfterLoad());
    }

    @Test
    public void aJAXDataTest() {
        mainPage.goToPageByLink(AJAX_DATA_LINK);
        assertTrue(ajaxDataPage.clickOnButton());
    }

    @Test
    public void clientSideDelayPage() {
        mainPage.goToPageByLink(CLIENT_SITE_DELAY_LINK);
        assertTrue(clientSideDelayPage.clickOnButton());
    }

    @Test
    public void clickPageTest() {
        mainPage.goToPageByLink(CLICK_LINK);
        assertTrue(clickPage.clickTwoTimes());
    }

    @Test
    public void textInputTest() {
        mainPage.goToPageByLink(TEXT_INPUT_LINK);
        assertTrue(textInputPage.isInputtedTextInButton(INPUT_TEXT));
    }

    @Test
    public void scrollbarsTest() {
        mainPage.goToPageByLink(SCROLLBARS_LINK);
        assertTrue(scrollbarsPage.clickOnButtonInContainer());
    }

    @Test
    public void dynamicTableTest() {
        mainPage.goToPageByLink(DYNAMIC_TABLE_LINK);
        assertTrue(dynamicTablePage.compareValueInYellowLabel(DYNAMIC_TABLE_HEADER_NAME, DYNAMIC_TABLE_ROW_NAME));
    }

    @Test
    public void verifyTextTest() {
        mainPage.goToPageByLink(VERIFY_TEXT_LINK);
        assertTrue(verifyText.isTextCorrect());
    }

    @Test
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
