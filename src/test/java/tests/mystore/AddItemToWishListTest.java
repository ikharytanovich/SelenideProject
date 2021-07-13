package tests.mystore;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.AssertJUnit.assertEquals;
import static pages.PageFactory.*;

public class AddItemToWishListTest extends BaseTest {

    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "open item page and change color then proceed")
    public void openItemPageAndChangeColorThenProceed(String... items) {
        for (String item : items) {
            menuBar.searchFor(item);
            catalogPage.openItemDetailed(item);
            itemDetailPage.addToWishlist();
        }
        menuBar.goToUserPage();
        userPage.openWishListPage();
        wishlistPage.openWishList();
        assertEquals(wishlistPage.getWishListItemsAmount(), items.length);
        wishlistPage.deleteItems();
    }

    @DataProvider(name = "DataProviderForCatalog")
    public Object[][] params() {
        return new Object[][]{
                {"Printed Chiffon Dress", "Printed Dress"},
                {"Faded Short Sleeve T-shirts", "Printed Chiffon Dress", "Printed Chiffon Dress"}
        };
    }
}
