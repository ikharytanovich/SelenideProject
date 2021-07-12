package pages;

import utils.loggerutils.ILogger;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage implements ILogger {
    private static final String MAIN_URL = "http://automationpractice.com/index.php";

    public static void openMainPage() {
        open(MAIN_URL);
    }
}
