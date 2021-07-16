package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HiddenLayers extends BasePage {
    public final String greenButton = "//button[@id='greenButton']";
    public final String blueButton = "//button[@id='blueButton']";

    public boolean isGreenButtonHiddenUnderBlueButton() {
        $x(greenButton).shouldBe(visible).click();
        log().info("CLICK ON GREEN BUTTON");
        return $x(blueButton).is(visible);
    }
}
