package pages.playgroundpages;

import pages.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static enums.TestsIntegersConstants.WAIT_25_SECONDS;

public class ClientSideDelayPage extends BasePage {
    private final String button = "//button[@id='ajaxButton']";
    private final String resultField = "//p[@class='bg-success']";

    public boolean isClickedOnButton() {
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON BUTTON AND WAIT FOR RESULT");
        return $x(resultField).shouldBe(visible, Duration.ofSeconds(WAIT_25_SECONDS.getValue())).is(visible);
    }
}
