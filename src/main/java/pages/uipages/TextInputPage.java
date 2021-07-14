package pages.uipages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage {
    private static final String INPUT_FIELD = "//input[@id='newButtonName']";
    private static final String BUTTON = "//button[@id='updatingButton']";

    public boolean isInputtedTextInButton(String text) {
        $x(INPUT_FIELD).shouldBe(Condition.visible).setValue(text);
        $x(BUTTON).shouldBe(Condition.visible).click();
        return $x(BUTTON).shouldBe(Condition.visible).getText().equals(text);
    }

}
