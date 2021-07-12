package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CatalogPage extends BasePage {
    private static final String ITEM = "//a[@title='%s']/ancestor::div[@class='product-container']";
    private static final String ADD_TO_CART_ITEM = "//a[@title='Add to cart']";
    private static final String PROCEED_PAYMENT = "//div[@class='clearfix']//a";

    public void addItemToCartAndProceedPayment(String itemName) {
        $x(format(ITEM, itemName)).shouldBe(Condition.visible).hover();
        $x(format(ITEM + ADD_TO_CART_ITEM, itemName)).shouldBe(Condition.visible).click();
        $x(PROCEED_PAYMENT).shouldBe(Condition.visible).click();
    }
}
