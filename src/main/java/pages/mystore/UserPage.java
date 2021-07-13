package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class UserPage extends BasePage {
    private static final String WISHLIST_BUTTON = "//span[text()='My wishlists']";

    public void openWishListPage() {
        $x(WISHLIST_BUTTON).shouldBe(Condition.visible).click();
    }
}
