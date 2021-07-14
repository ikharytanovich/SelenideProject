package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ScrollbarsPage extends BasePage {
    private static final String BUTTON = "//button[@id='hidingButton']";

    public boolean isClickedOnButtonInContainer() {
        $x(BUTTON).shouldBe(visible).scrollTo().click();
        log().info("SCROLL TO ELEMENT AND CLICK");
        return true;
    }
}
