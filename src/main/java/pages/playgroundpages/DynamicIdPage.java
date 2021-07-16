package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicIdPage extends BasePage {
    private final String button = "//button[@class='btn btn-primary']";

    public boolean isClickedOnButton() {
        $x(button).shouldBe(visible).click();
        log().info("PRESSED ON BUTTON");
        return true;
    }
}
