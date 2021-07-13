package tests.mystore;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.PageFactory.*;

public class CartMenuTest extends BaseTest {
    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "add items co cart, then check that amounts same")
    public void checkThatCartHaveRightItemsAmount(String... items) {
        for (String item : items) {
            menuBar.searchFor(item);
            catalogPage.openItemDetailed(item);
            itemDetailPage.addToCart();
            itemDetailPage.continueShopping();
        }
        Assert.assertEquals(menuBar.getAmountOfItemsInCartMenu(), items.length);
        menuBar.clearCartMenu();
    }

    @DataProvider(name = "DataProviderForCatalog")
    public Object[][] params() {
        return new Object[][]{
                {"Printed Chiffon Dress", "Printed Dress"},
                {"Faded Short Sleeve T-shirts", "Printed Chiffon Dress", "Printed Chiffon Dress"}
        };
    }
}
