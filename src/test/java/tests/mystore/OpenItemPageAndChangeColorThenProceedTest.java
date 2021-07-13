package tests.mystore;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.PageFactory.*;

public class OpenItemPageAndChangeColorThenProceedTest extends BaseTest {

    @Test(dataProvider = "DataProviderForCatalog")
    @Description(value = "open item page and change color then proceed")
    public void openItemPageAndChangeColorThenProceed(String item) {
        menuBar.searchFor(item);
        catalogPage.openItemPage(item);
        catalogPage.changeItemColorToLast();
        catalogPage.addToCart();
        catalogPage.proceedPayment();
        paymentPage.proceedPaymentWithCheque();
        menuBar.breadCrumbGetHome();
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
