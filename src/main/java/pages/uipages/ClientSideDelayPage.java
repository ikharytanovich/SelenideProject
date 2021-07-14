package pages.uipages;

import pages.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ClientSideDelayPage extends BasePage {
    private static final String BUTTON = "//button[@id='ajaxButton']";
    private static final String RESULT_FIELD = "//p[@class='bg-success']";
    private static final long CUSTOM_WAIT_TIME = 25;

    public boolean clickOnButton() {
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON BUTTON AND WAIT FOR RESULT");
        return $x(RESULT_FIELD).shouldBe(visible, Duration.ofSeconds(CUSTOM_WAIT_TIME)).is(visible);
    }
}
