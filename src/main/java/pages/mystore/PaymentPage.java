package pages.mystore;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PaymentPage extends BasePage {
    private static final String PROCEED_TO_CHECKOUT = "//p/a[@title='Proceed to checkout']";
    private static final String PROCEED_TO_ADDRESS = "//button[@name='processAddress']";
    private static final String CHECKBOX = "//span/input[@type='checkbox']/parent::span";
    private static final String PROCEED_TO_CARRIER = "//button[@name='processCarrier']";
    private static final String CHEQUE_PAYMENT = "//a[@class='cheque']";
    private static final String CARD_PAYMENT = "//a[@class='bankwire']";
    private static final String CONFIRM_ORDER = "//button[@class='button btn btn-default button-medium']";
    private static final String ITEMS_IN_PAYMENT = "//a[@class='cart_quantity_delete']";

    public void proceedPaymentWithCheque() {
        proceedToCheckOut();
        proceedToAddress();
        confirmCheckBox();
        proceedToCarrier();
        payByCheque();
        confirmOrder();
    }

    public void proceedPaymentWithCard() {
        proceedToCheckOut();
        proceedToAddress();
        confirmCheckBox();
        proceedToCarrier();
        payByCard();
        confirmOrder();
    }

    public void proceedToCheckOut() {
        $x(PROCEED_TO_CHECKOUT).shouldBe(Condition.visible).click();
        log().info("PROCEED TO CHECKOUT");
    }

    public void proceedToAddress() {
        $x(PROCEED_TO_ADDRESS).shouldBe(Condition.visible).click();
        log().info("PROCEED TO ADDRESS");
    }

    public void confirmCheckBox() {
        $x(CHECKBOX).shouldBe(Condition.visible).click();
        log().info("CONFIRM CHECKBOX");
    }

    public void proceedToCarrier() {
        $x(PROCEED_TO_CARRIER).shouldBe(Condition.visible).click();
        log().info("PROCEED TO CARRIER");
    }

    public void payByCard() {
        $x(CARD_PAYMENT).shouldBe(Condition.visible).click();
        log().info("PAY BY CARD");
    }

    public void payByCheque() {
        $x(CHEQUE_PAYMENT).shouldBe(Condition.visible).click();
        log().info("PAY BY CHEQUE");
    }

    public void confirmOrder() {
        $x(CONFIRM_ORDER).shouldBe(Condition.visible).click();
        log().info("ODER CONFIRM");
    }

    public void deleteItemsFromPaymentPage() {
        $$x(ITEMS_IN_PAYMENT).forEach(SelenideElement::click);
    }
}
