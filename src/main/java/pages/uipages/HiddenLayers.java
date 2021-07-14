package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HiddenLayers extends BasePage {
    public static final String GREEN_BUTTON = "//button[@id='greenButton']";
    public static final String BLUE_BUTTON = "//button[@id='blueButton']";

    public boolean isGreenButtonHiddenUnderBlueButton() {
        $x(GREEN_BUTTON).shouldBe(visible).click();
        log().info("CLICK ON GREEN BUTTON");
        return $x(BLUE_BUTTON).is(visible);
    }
}
