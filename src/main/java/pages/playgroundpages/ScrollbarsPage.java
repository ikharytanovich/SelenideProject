package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ScrollbarsPage extends BasePage {
    private final String button = "//button[@id='hidingButton']";

    public boolean isClickedOnButtonInContainer() {
        $x(button).shouldBe(visible).scrollTo().click();
        log().info("SCROLL TO ELEMENT AND CLICK");
        return true;
    }
}
