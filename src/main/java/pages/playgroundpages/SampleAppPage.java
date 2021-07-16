package pages.playgroundpages;

import pages.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SampleAppPage extends BasePage {
    private final String userNameField = "//input[@name='UserName']";
    private final String passwordField = "//input[@name='Password']";
    private final String button = "//button[@class='btn btn-primary']";

    public boolean isLoggedIn(String username, String password) {
        $x(userNameField).shouldBe(visible).setValue(username);
        log().info("INPUT USERNAME");
        $x(passwordField).shouldBe(visible).setValue(password);
        log().info("INPUT PASSWORD");
        $x(button).shouldBe(visible).click();
        log().info("CLICK ON LOGIN");
        return $x(button).shouldBe(visible).getText().equals("Log Out");
    }
}
