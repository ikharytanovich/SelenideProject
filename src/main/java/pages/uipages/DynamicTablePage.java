package pages.uipages;

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
    private static final TableUtils DYNAMIC_TABLE_UTILS = new WAIARIADynamicTableUtils();
    private static final String HEADERS = "//span[@role='columnheader']";
    private static final String EXPECTED_VALUE = "//p[@class='bg-warning']";

    public boolean compareValueInYellowLabel(String headerName, String rowName) {
        List<SelenideElement> headers = $$x(HEADERS);
        int columnId = DYNAMIC_TABLE_UTILS.getHeaderId(headers, headerName);
        SelenideElement searchedElement = DYNAMIC_TABLE_UTILS.getElementFromTableByRowNameAndColumnId(rowName, columnId);
        SelenideElement elementWithExpectedValue = $x(EXPECTED_VALUE);
        return getPureResultFromElement(elementWithExpectedValue, headerName).equals(searchedElement.getText());
    }

    private String getPureResultFromElement(WebElement dirtyResult, String headerName) {
        String[] splitStrings = dirtyResult.getText().split(format("%s: ", headerName));
        return splitStrings[1].trim();
    }
}