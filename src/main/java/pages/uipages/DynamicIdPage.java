package pages.uipages;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicIdPage extends BasePage {
    private static final String BUTTON = "//button[@class='btn btn-primary']";

    public boolean clickOnButton() {
        $x(BUTTON).shouldBe(Condition.visible).click();
        log().info("PRESSED ON BUTTON");
        return true;
    }
}
