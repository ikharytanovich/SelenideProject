package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage extends BasePage {
    private final String inputField = "//input[@id='newButtonName']";
    private final String button = "//button[@id='updatingButton']";

    public boolean isInputtedTextInButton(String text) {
        $x(inputField).shouldBe(visible).setValue(text);
        log().info("INPUT TEXT IN FIELD");
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON BUTTON TO CHANGE BUTTON NAME");
        return $x(button).shouldBe(visible).getText().equals(text);
    }

}
