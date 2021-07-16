package tests.playgroundtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static enums.TestsStringsConstants.DYNAMIC_TABLE_HEADER;
import static enums.TestsStringsConstants.DYNAMIC_TABLE_ROW;
import static org.testng.Assert.assertTrue;
import static pages.PageFactory.dynamicTablePage;
import static pages.PageFactory.mainPage;
import static pages.playgroundpages.MainPage.DYNAMIC_TABLE_LINK;

public class DynamicTableTest extends BaseTest {
    @Test(description = "find in table value and compare to result box")
    public void dynamicTableTest() {
        mainPage.goToPageByLink(DYNAMIC_TABLE_LINK);
        assertTrue(dynamicTablePage.isSameWithValueInYellowLabel(DYNAMIC_TABLE_HEADER.getValue(), DYNAMIC_TABLE_ROW.getValue()));
    }
}
