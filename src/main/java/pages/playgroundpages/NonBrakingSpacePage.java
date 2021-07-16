package pages.playgroundpages;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class NonBrakingSpacePage extends BasePage {
    private static final String BUTTON = "//button[contains(text(),'My') and contains(text(),'Button')]";

    public boolean isButtonClicked() {
        $x(BUTTON).shouldBe(Condition.visible).click();
        log().info("CLICK ON BUTTON");
        return true;
    }
}
