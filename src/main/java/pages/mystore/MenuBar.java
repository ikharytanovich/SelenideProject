package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MenuBar extends BasePage {
    private static final String SIGN_IN_BUTTON = "//a[@class='login']";
    private static final String SIGN_OUT_BUTTON = "//a[@class='logout']";
    private static final String SEARCH_FIELD = "//input[@class='search_query form-control ac_input']";

    public void getToLogInPage() {
        $x(SIGN_IN_BUTTON).shouldBe(Condition.visible).click();
        log().info("REDIRECT TO LOGIN PAGE");
    }

    public void signOut() {
        $x(SIGN_OUT_BUTTON).shouldBe(Condition.visible).click();
        log().info("SIGN OUT");
    }

    public void searchFor(String itemToSearch) {
        $x(SEARCH_FIELD).shouldBe(Condition.visible).setValue(itemToSearch).submit();
        log().info("SEARCH FOR: " + itemToSearch);
    }
}
