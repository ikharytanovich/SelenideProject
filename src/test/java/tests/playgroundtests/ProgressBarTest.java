package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static enums.TestsIntegersConstants.PROGRESS_BAR_VALUE;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.mainPage;
import static pages.PageFactory.progressBarPage;
import static pages.playgroundpages.MainPage.PROGRESS_BAR_LINK;

public class ProgressBarTest extends BaseTest {
    @Test(description = "click on start button and when progress bar get to N percent click on stop")
    public void progressBarTest() {
        mainPage.goToPageByLink(PROGRESS_BAR_LINK);
        assertTrue(progressBarPage.isCorrectlyStoppedInNPercent(PROGRESS_BAR_VALUE.getValue()));
    }
}
