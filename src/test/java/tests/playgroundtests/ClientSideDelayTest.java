package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static pages.PageFactory.clientSideDelayPage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.CLIENT_SITE_DELAY_LINK;

public class ClientSideDelayTest extends BaseTest {
    @Test(description = "find button after load and click")
    public void clientSideDelayPage() {
        mainPage.goToPageByLink(CLIENT_SITE_DELAY_LINK);
        assertTrue(clientSideDelayPage.isClickedOnButton());
    }
}
