package pages.playgroundpages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import ui.TableUtils;
import ui.impl.WAIARIADynamicTableUtils;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class DynamicTablePage extends BasePage {
    private final TableUtils dynamicTableUtils = new WAIARIADynamicTableUtils();
    private final String headers = "//span[@role='columnheader']";
    private final String expectedValue = "//p[@class='bg-warning']";

    public boolean isSameWithValueInYellowLabel(String headerName, String rowName) {
        List<SelenideElement> headers = $$x(this.headers);
        log().info("GET HEADERS FROM TABLE");
        int columnId = dynamicTableUtils.getHeaderId(headers, headerName);
        log().info(format("GET HEADER ID OF COLUMN %s", headerName));
        SelenideElement searchedElement = dynamicTableUtils.getElementFromTableByRowNameAndColumnId(rowName, columnId);
        log().info(format("GET ELEMENT BY ROWNAME %s", rowName));
        SelenideElement elementWithExpectedValue = $x(expectedValue);
        log().info("GET EXPECTED ELEMENT AND COMPARE WITH ACTUAL");
        return getPureResultFromElement(elementWithExpectedValue, headerName).equals(searchedElement.getText());
    }

    private String getPureResultFromElement(WebElement dirtyResult, String headerName) {
        String[] splitStrings = dirtyResult.getText().split(format("%s: ", headerName));
        return splitStrings[1].trim();
    }
}
