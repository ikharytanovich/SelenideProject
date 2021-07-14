package pages.uipages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SampleAppPage extends BasePage {
    private static final String USER_NAME_FIELD = "//input[@name='UserName']";
    private static final String PASSWORD_FIELD = "//input[@name='Password']";
    private static final String BUTTON = "//button[@class='btn btn-primary']";

    public boolean isLoggedIn(String username, String password) {
        $x(USER_NAME_FIELD).shouldBe(visible).setValue(username);
        log().info("INPUT USERNAME");
        $x(PASSWORD_FIELD).shouldBe(visible).setValue(password);
        log().info("INPUT PASSWORD");
        $x(BUTTON).shouldBe(visible).click();
        log().info("CLICK ON LOGIN");
        return $x(BUTTON).shouldBe(visible).getText().equals("Log Out");
    }
}