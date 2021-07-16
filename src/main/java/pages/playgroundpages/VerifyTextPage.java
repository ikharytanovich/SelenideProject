package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class VerifyTextPage extends BasePage {
    private static final String TEXT_FIELD = "//div/span[contains(text(),'Welcome')]";

    public boolean isTextCorrect() {
        log().info("FIND AND VERIFY TEXT");
        return $x(TEXT_FIELD).shouldBe(visible).getText().equals("Welcome UserName!");
    }
}
