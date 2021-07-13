package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
    private static final String ITEM = "//a[@title='%s']/ancestor::div[@class='product-container']";
    private static final String ADD_TO_CART_ITEM = "//a[@title='Add to cart']";
    private static final String CONTINUE_SHOPPING_BUTTON = "//span[@title='Continue shopping']";
    private static final String PROCEED_PAYMENT_BUTTON = "//div[@class='clearfix']//a";


    public void openItemDetailed(String itemName) {
        $x(format(ITEM, itemName)).shouldBe(Condition.visible).click();
        log().info("OPENED PAGE OF: " + itemName);
    }

    public void proceedPayment() {
        $x(PROCEED_PAYMENT_BUTTON).shouldBe(Condition.visible).click();
        log().info("PROCEED TO PAYMENT");
    }

    public void continueShopping() {
        $x(CONTINUE_SHOPPING_BUTTON).shouldBe(Condition.visible).click();
        log().info("SHOPPING CONTINUED");
    }

    public void proceedToPaymentWithoutOpeningItemDetailPage(String itemName) {
        $x(format(ITEM, itemName)).shouldBe(Condition.visible).hover();
        $x(format(ITEM + ADD_TO_CART_ITEM, itemName)).shouldBe(Condition.visible).click();
        proceedPayment();
    }
}
