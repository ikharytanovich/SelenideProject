package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClickPage extends BasePage {
    private static final String BUTTON = "//button[@id='badButton']";

    public boolean isClickedTwoTimes() {
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON BUTTON FIRST TIME");
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON BUTTON SECOND TIME");
        return true;
    }
}
