package ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface TableUtils {
    int getHeaderId(List<SelenideElement> headers, String headerName);

    SelenideElement getElementFromTableByRowNameAndColumnId(String name, int id);
}
