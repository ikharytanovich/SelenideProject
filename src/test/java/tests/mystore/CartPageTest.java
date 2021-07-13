package tests.mystore;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.PageFactory.*;

public class CartPageTest extends BaseTest {
    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "add items co cart, then check that amounts same")
    public void checkThatCartHaveRightItemsAmount(String... items) {
        for (String item : items) {
            menuBar.searchFor(item);
            catalogPage.openItemPage(item);
            catalogPage.addToCart();
            catalogPage.continueShopping();
        }
        menuBar.openCartPage();
        paymentPage.proceedPaymentWithCard();
    }

    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "add items co cart, then delete them")
    public void addItemAndDeleteFormCartPage(String... items) {
        for (String item : items) {
            menuBar.searchFor(item);
            catalogPage.openItemPage(item);
            catalogPage.addToCart();
            catalogPage.continueShopping();
        }
        menuBar.openCartPage();
        paymentPage.deleteItemsFromPaymentPage();
    }

    @DataProvider(name = "DataProviderForCatalog")
    public Object[][] params() {
        return new Object[][]{
                {"Printed Chiffon Dress", "Printed Dress"}
        };
    }
}
