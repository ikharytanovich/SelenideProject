package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class MouseOverPage extends BasePage {
    private static final String CLICK_LINK = "//a[text()='Click me']";
    private static final String RESULT_FIELD = "//span[@id='clickCount']";

    public boolean isClickedRightTimes(int n) {
        for (int i = 0; i < n; i++) {
            $x(CLICK_LINK).shouldBe(visible).click();
            log().info("CLICK ON BUTTON");
        }
        log().info(format("CHECK THAT FIELD OF CLICK IS %d", n));
        return Integer.parseInt($x(RESULT_FIELD).shouldBe(visible).getText()) == n;
    }
}
