package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class MouseOverPage extends BasePage {
    private final String clickLink = "//a[text()='Click me']";
    private final String resultField = "//span[@id='clickCount']";

    public boolean isClickedRightTimes(int n) {
        for (int i = 0; i < n; i++) {
            $x(clickLink).shouldBe(visible).click();
            log().info("CLICK ON BUTTON");
        }
        log().info(format("CHECK THAT FIELD OF CLICK IS %d", n));
        return Integer.parseInt($x(resultField).shouldBe(visible).getText()) == n;
    }
}
