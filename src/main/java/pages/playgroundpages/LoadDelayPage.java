package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoadDelayPage extends BasePage {
    private final String button = "//button[@class='btn btn-primary']";

    public boolean isClickedOnButtonAfterLoad() {
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON BUTTON AFTER LOAD");
        return true;
    }
}
