package tests.mystore;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.PageFactory.*;

public class LoginAndOrderTest extends BaseTest {

    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "add item and make order without opening item page with cheque payment")
    public void AddItemProceedPaymentWithCheque(String item) {
        menuBar.searchFor(item);
        catalogPage.addItemToCartAndProceedPayment(item);
        paymentPage.proceedPaymentWithCheque();
    }

    @DataProvider(name = "DataProviderForCatalog")
    public Object[][] params() {
        return new Object[][]{
                {"Printed Chiffon Dress"},
                {"Printed Dress"},
                {"Faded Short Sleeve T-shirts"}
        };
    }
}
