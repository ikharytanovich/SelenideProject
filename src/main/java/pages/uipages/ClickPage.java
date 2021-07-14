package pages.uipages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class ClickPage {
    private static final String BUTTON = "//button[@id='badButton']";

    public boolean clickTwoTimes() {
        $x(BUTTON).shouldBe(Condition.visible).click();
        $x(BUTTON).shouldBe(Condition.visible).click();
        return true;
    }
}
