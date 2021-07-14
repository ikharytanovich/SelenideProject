package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicIdPage extends BasePage {
    private static final String BUTTON = "//button[@class='btn btn-primary']";

    public boolean clickOnButton() {
        $x(BUTTON).shouldBe(visible).click();
        log().info("PRESSED ON BUTTON");
        return true;
    }
}
