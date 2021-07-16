package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.hiddenLayers;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.HIDDEN_LAYERS_LINK;

public class HiddenLayersTest extends BaseTest {
    @Test(description = "find green button and click on it, then check is green button covered by blue")
    public void hiddenLayersTest() {
        mainPage.goToPageByLink(HIDDEN_LAYERS_LINK);
        assertTrue(hiddenLayers.isGreenButtonHiddenUnderBlueButton());
    }
}
