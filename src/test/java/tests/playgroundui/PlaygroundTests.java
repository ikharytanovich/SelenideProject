package tests.playgroundui;

import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.TestsConstants.INPUT_TEXT;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.*;
import static pages.uipages.MainPage.*;

public class PlaygroundTests extends BaseTest {

    @Test(description = "locate button and click on it without using id")
    public void DynamicIdTest() {
        mainPage.goToPageByLink(DYNAMIC_ID_LINK);
        assertTrue(dynamicIdPage.clickOnButton());
    }

    @Test(description = "find button and click on it with xpath")
    public void ClassAttributeTest() {
        mainPage.goToPageByLink(CLASS_ATTRIBUTE_LINK);
        assertTrue(classAttributePage.clickObBlueButton());
    }

    @Test(description = "find green button and click on it, then check is green button covered by blue")
    public void HiddenLayersTest() {
        mainPage.goToPageByLink(HIDDEN_LAYERS_LINK);
        assertTrue(hiddenLayers.isGreenButtonHiddenUnderBlueButton());
    }

    @Test
    public void LoadDelayTest() {
        mainPage.goToPageByLink(LOAD_DELAY_LINK);
        assertTrue(loadDelayPage.clickOnButtonAfterLoad());
    }

    @Test
    public void AJAXDataTest() {
        mainPage.goToPageByLink(AJAX_DATA_LINK);
        assertTrue(ajaxDataPage.clickOnButton());
    }

    @Test
    public void ClientSideDelayPage() {
        mainPage.goToPageByLink(CLIENT_SITE_DELAY_LINK);
        assertTrue(clientSideDelayPage.clickOnButton());
    }

    @Test
    public void ClickPageTest() {
        mainPage.goToPageByLink(CLICK_LINK);
        assertTrue(clickPage.clickTwoTimes());
    }

    @Test
    public void textInputTest() {
        mainPage.goToPageByLink(TEXT_INPUT_LINK);
        assertTrue(textInputPage.isInputtedTextInButton(INPUT_TEXT));
    }

    @Test
    public void ScrollbarsTest(){
        mainPage.goToPageByLink(SCROLLBARS_LINK);
        assertTrue(scrollbarsPage.clickOnButtonInContainer());
    }
}
