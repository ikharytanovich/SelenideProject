package pages.mystore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.BasePage;

public class LogInPage extends BasePage {
    private static final String EMAIL_FIELD = "//input[@id='email']";
    private static final String PASSWORD_FIELD = "//input[@id='passwd']";
    private static final String CONFIRM_BUTTON = "//button[@id='SubmitLogin']";

    public void logIn(String email, String password) {
        Selenide.$x(EMAIL_FIELD).shouldBe(Condition.visible).setValue(email);
        Selenide.$x(PASSWORD_FIELD).shouldBe(Condition.visible).setValue(password);
        Selenide.$x(CONFIRM_BUTTON).shouldBe(Condition.visible).click();
        log().info("LOGGED IN SYSTEM AS: " + email + " password: " + password);
    }
}
