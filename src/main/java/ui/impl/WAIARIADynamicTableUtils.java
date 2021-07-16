package ui.impl;

import com.codeborne.selenide.SelenideElement;
import ui.TableUtils;

import java.util.List;
import java.util.Optional;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class WAIARIADynamicTableUtils implements TableUtils {
    private final String searchedElementLocatorWith = "//span[@role='cell'][text()='%s']//following-sibling::span[%s]";

    @Override
    public int getHeaderId(List<SelenideElement> headers, String headerName) {
        int headerId = 0;
        Optional<SelenideElement> selenideElement = headers.stream().filter(x -> x.getText().equals(headerName)).findFirst();
        if (selenideElement.isPresent()) {
            headerId = headers.indexOf(selenideElement.get());
        } else {
            throw new IllegalArgumentException();
        }
        return headerId;
    }

    @Override
    public SelenideElement getElementFromTableByRowNameAndColumnId(String name, int id) {
        return $x(format(searchedElementLocatorWith, name, id));
    }
}
