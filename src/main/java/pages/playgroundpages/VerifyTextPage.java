package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class VerifyTextPage extends BasePage {
    private final String textField = "//div/span[contains(text(),'Welcome')]";

    public boolean isTextCorrect() {
        log().info("FIND AND VERIFY TEXT");
        return $x(textField).shouldBe(visible).getText().equals("Welcome UserName!");
    }
}
