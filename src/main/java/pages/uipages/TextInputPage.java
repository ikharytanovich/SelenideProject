package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage {
    private static final String INPUT_FIELD = "//input[@id='newButtonName']";
    private static final String BUTTON = "//button[@id='updatingButton']";

    public boolean isInputtedTextInButton(String text) {
        $x(INPUT_FIELD).shouldBe(visible).setValue(text);
        log().info("INPUT TEXT IN FIELD");
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON BUTTON TO CHANGE BUTTON NAME");
        return $x(BUTTON).shouldBe(visible).getText().equals(text);
    }

}
