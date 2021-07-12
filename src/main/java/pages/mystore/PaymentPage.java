package pages.mystore;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentPage extends BasePage {
    private static final String PROCEED_TO_CHECKOUT = "//p/a[@title='Proceed to checkout']";
    private static final String PROCEED_TO_ADDRESS = "//button[@name='processAddress']";
    private static final String CHECKBOX = "//span/input[@type='checkbox']/parent::span";
    private static final String PROCEED_TO_CARRIER = "//button[@name='processCarrier']";
    private static final String CHEQUE_PAYMENT = "//a[@class='cheque']";
    private static final String CONFIRM_ORDER = "//button[@class='button btn btn-default button-medium']";

    public void proceedPaymentWithCheque() {
        $x(PROCEED_TO_CHECKOUT).shouldBe(Condition.visible).click();
        log().info("PROCEED TO CHECKOUT");
        $x(PROCEED_TO_ADDRESS).shouldBe(Condition.visible).click();
        log().info("PROCEED TO ADDRESS");
        $x(CHECKBOX).shouldBe(Condition.visible).click();
        log().info("CONFIRM CHECKBOX");
        $x(PROCEED_TO_CARRIER).shouldBe(Condition.visible).click();
        log().info("PROCEED TO CARRIER");
        $x(CHEQUE_PAYMENT).shouldBe(Condition.visible).click();
        log().info("PAY BY CHEQUE");
        $x(CONFIRM_ORDER).shouldBe(Condition.visible).click();
        log().info("ODER CONFIRM");
    }
}
