package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoadDelayPage extends BasePage {
    private static final String BUTTON = "//button[@class='btn btn-primary']";

    public boolean isClickedOnButtonAfterLoad() {
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON BUTTON AFTER LOAD");
        return true;
    }
}
