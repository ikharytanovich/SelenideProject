package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ItemDetailPage extends BasePage {
    private static final String COLORS = "//ul[@id='color_to_pick_list']/li";
    private static final String ADD_TO_CART = "//span[text()='Add to cart']";
    private static final String CONTINUE_SHOPPING_BUTTON = "//span[@title='Continue shopping']";
    private static final String PROCEED_PAYMENT_BUTTON = "//div[@class='clearfix']//a";
    private static final String ADD_TO_WISHLIST = "//a[@id='wishlist_button']";
    private static final String CLOSE_BUTTON = "//a[@title='Close']";

    public void changeItemColorToLast() {
        $$x(COLORS).filter(Condition.visible).last().click();
        log().info("COLOR CHANGED TO LAST");
    }

    public void addToCart() {
        $x(ADD_TO_CART).shouldBe(Condition.visible).click();
        log().info("ADDED TO CART");
    }

    public void proceedPayment() {
        $x(PROCEED_PAYMENT_BUTTON).shouldBe(Condition.visible).click();
        log().info("PROCEED TO PAYMENT");
    }

    public void continueShopping() {
        $x(CONTINUE_SHOPPING_BUTTON).shouldBe(Condition.visible).click();
        log().info("SHOPPING CONTINUED");
    }

    public void addToWishlist() {
        $x(ADD_TO_WISHLIST).shouldBe(Condition.visible).click();
        $x(CLOSE_BUTTON).shouldBe(Condition.visible).click();
        log().info("ADDED TO WISHLIST");
    }
}
