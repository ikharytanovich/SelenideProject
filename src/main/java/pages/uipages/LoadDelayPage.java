package pages.uipages;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class LoadDelayPage extends BasePage {
    private static final String BUTTON = "//button[@class='btn btn-primary']";

    public boolean clickOnButtonAfterLoad() {
        $x(BUTTON).shouldBe(Condition.visible).click();
        return true;
    }
}
