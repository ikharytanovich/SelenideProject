package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
    private static final String ITEM = "//a[@title='%s']/ancestor::div[@class='product-container']";
    private static final String ADD_TO_CART_ITEM = "//a[@title='Add to cart']";
    private static final String PROCEED_PAYMENT = "//div[@class='clearfix']//a";
    private static final String COLORS = "//ul[@id='color_to_pick_list']/li";
    private static final String ADD_TO_CART = "//span[text()='Add to cart']";

    public void openItemPage(String itemName) {
        $x(format(ITEM, itemName)).shouldBe(Condition.visible).click();
    }

    public void changeItemColorToLast() {
        $$x(COLORS).filter(Condition.visible).last().click();
    }

    public void addToCart() {
        $x(ADD_TO_CART).shouldBe(Condition.visible).click();
    }

    public void proceedPayment() {
        $x(PROCEED_PAYMENT).shouldBe(Condition.visible).click();
    }

    public void proceedToPaymentWithoutOpeningItemPage(String itemName) {
        $x(format(ITEM, itemName)).shouldBe(Condition.visible).hover();
        $x(format(ITEM + ADD_TO_CART_ITEM, itemName)).shouldBe(Condition.visible).click();
        proceedPayment();
    }
}
