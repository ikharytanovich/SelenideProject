package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClassAttributePage extends BasePage {
    private final String blueButton = "//button[contains(@class,'btn-primary')]";

    public boolean isClickedOnBlueButton() {
        $x(blueButton).shouldBe(visible).click();
        log().info("BLUE BUTTON WAS LOCATED AND CLICKED");
        return true;
    }
}
