package pages.mystore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MenuBar extends BasePage {
    private static final String SIGN_IN_BUTTON = "//a[@class='login']";
    private static final String SIGN_OUT_BUTTON = "//a[@class='logout']";
    private static final String SEARCH_FIELD = "//input[@class='search_query form-control ac_input']";
    private static final String WOMEN_PAGE = "//a[@title='Women']";
    private static final String BREAD_CRUMB_HOME = "//div/a[@class='home']";
    private static final String SHOPPING_CART_MENU = "//a[@title='View my shopping cart']";
    private static final String PROCEED_FROM_CART_MENU = "//a[@id='button_order_cart']/span";
    private static final String REMOVE_BUTTON_CART_MENU = "//a[@class='ajax_cart_block_remove_link']";
    private static final String CART_ITEM_AMOUNT = "//a/span[@class='ajax_cart_quantity']";
    private static final String USER_PAGE = "//a[@class='account']";

    public void breadCrumbGetHome() {
        $x(BREAD_CRUMB_HOME).shouldBe(Condition.visible).click();
        log().info("REDIRECT TO HOME PAGE");
    }

    public void goToWomenPage() {
        $x(WOMEN_PAGE).shouldBe(Condition.visible).click();
        log().info("REDIRECT TO WOMEN PAGE");
    }

    public void proceedFromCartMenu() {
        $x(SHOPPING_CART_MENU).shouldBe(Condition.visible).hover();
        $x(PROCEED_FROM_CART_MENU).shouldBe(Condition.visible).click();
        log().info("PROCEED FORM CART MENU");
    }

    public void clearCartMenu() {
        $x(SHOPPING_CART_MENU).shouldBe(Condition.visible).hover();
        $$x(REMOVE_BUTTON_CART_MENU).forEach(SelenideElement::click);
        log().info("CLEAR CART");
    }

    public int getAmountOfItemsInCartMenu() {
        $x(SHOPPING_CART_MENU).shouldBe(Condition.visible).hover();
        log().info("GET AMOUNT OF ITEM IN CART");
        return Integer.parseInt($x(CART_ITEM_AMOUNT).getText());
    }

    public void getToLogInPage() {
        $x(SIGN_IN_BUTTON).shouldBe(Condition.visible).click();
        log().info("REDIRECT TO LOGIN PAGE");
    }

    public void signOut() {
        $x(SIGN_OUT_BUTTON).shouldBe(Condition.visible).click();
        log().info("SIGN OUT");
    }

    public void searchFor(String itemToSearch) {
        $x(SEARCH_FIELD).shouldBe(Condition.visible).setValue(itemToSearch).pressEnter();
        log().info("SEARCH FOR: " + itemToSearch);
    }

    public void openCartPage() {
        $x(SHOPPING_CART_MENU).shouldBe(Condition.visible).click();
    }

    public void goToUserPage() {
        $x(USER_PAGE).shouldBe(Condition.visible).click();
    }
}
