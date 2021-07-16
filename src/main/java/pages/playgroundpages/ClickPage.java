package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClickPage extends BasePage {
    private final String button = "//button[@id='badButton']";

    public boolean isClickedTwoTimes() {
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON BUTTON FIRST TIME");
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON BUTTON SECOND TIME");
        return true;
    }
}
