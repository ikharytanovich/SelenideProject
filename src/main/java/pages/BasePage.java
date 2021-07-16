package pages;

import utils.loggerutils.ILogger;

import static com.codeborne.selenide.Selenide.open;
import static enums.ConfigConstants.MAIN_URL;

public abstract class BasePage implements ILogger {

    public static void openMainPage() {
        open(MAIN_URL.getValue());
    }
}
