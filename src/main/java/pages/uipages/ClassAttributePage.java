package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClassAttributePage extends BasePage {
    private static final String BLUE_BUTTON = "//button[contains(@class,'btn-primary')]";

    public boolean clickObBlueButton() {
        $x(BLUE_BUTTON).shouldBe(visible).click();
        log().info("BLUE BUTTON WAS LOCATED AND CLICKED");
        return true;
    }
}
