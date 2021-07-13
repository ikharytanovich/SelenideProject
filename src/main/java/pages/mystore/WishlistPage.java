package pages.mystore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class WishlistPage extends BasePage {
    private static final String WISHLIST_OPEN = "//a[contains(text(),'My wishlist')]";
    private static final String ITEMS_IN_WISHLIST = "//td[@class='bold align_center']";
    private static final String ITEMS_REMOVE_IN_WISHLIST = "//td[@class='wishlist_delete']/a";

    public void openWishList() {
        $x(WISHLIST_OPEN).shouldBe(Condition.visible).click();
    }

    public int getWishListItemsAmount() {
        return Integer.parseInt($x(ITEMS_IN_WISHLIST).getText());
    }

    public void deleteItems() {
        $x(ITEMS_REMOVE_IN_WISHLIST).shouldBe(Condition.visible).click();
        Selenide.confirm();
    }
}
