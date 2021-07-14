package pages.uipages;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class ScrollbarsPage extends BasePage {
    private static final String BUTTON = "//button[@id='hidingButton']";

    public boolean clickOnButtonInContainer() {
        $x(BUTTON).shouldBe(Condition.visible).scrollTo().click();
        return true;
    }
}
