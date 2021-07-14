package pages.uipages;

import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProgressBarPage extends BasePage {
    private static final String BUTTON_START = "//button[@id='startButton']";
    private static final String BUTTON_STOP = "//button[@id='stopButton']";
    private static final String PROGRESS_BAR = "//div[@id='progressBar']";
    private static final String ATTRIBUTE_VALUE_NAME = "aria-valuenow";

    public boolean isCorrectlyStoppedInNPercent(int n) {
        SelenideElement progressBar = $x(PROGRESS_BAR);
        $x(BUTTON_START).shouldBe(visible).click();
        for (; ; ) {
            if (Integer.parseInt(progressBar.getAttribute(ATTRIBUTE_VALUE_NAME)) == n) {
                $x(BUTTON_STOP).shouldBe(visible).click();
                break;
            }
        }
        return Integer.parseInt(progressBar.getAttribute(ATTRIBUTE_VALUE_NAME)) == n;
    }
}
