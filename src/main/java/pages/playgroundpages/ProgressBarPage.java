package pages.playgroundpages;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProgressBarPage extends BasePage {
    private final String buttonStart = "//button[@id='startButton']";
    private final String buttonStop = "//button[@id='stopButton']";
    private final String progressBar = "//div[@id='progressBar']";
    private final String attributeValueName = "aria-valuenow";

    public boolean isCorrectlyStoppedInNPercent(int n) {
        SelenideElement progressBar = $x(this.progressBar);
        $x(buttonStart).shouldBe(visible).click();
        log().info("CLICK ON BUTTON");
        for (; ; ) {
            if (Integer.parseInt(progressBar.getAttribute(attributeValueName)) == n) {
                log().info("CLICK ON STOP IF ON NEEDED PERCENT");
                $x(buttonStop).shouldBe(visible).click();
                break;
            }
        }
        log().info("COMPARE RESULT WITH NEEDED PERCENT");
        return Integer.parseInt(progressBar.getAttribute(attributeValueName)) == n;
    }
}
