package pages.uipages;

import com.codeborne.selenide.Condition;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {
    public static final String DYNAMIC_ID_LINK = "//a[text()='Dynamic ID']";
    public static final String CLASS_ATTRIBUTE_LINK = "//a[text()='Class Attribute']";
    public static final String HIDDEN_LAYERS_LINK = "//a[text()='Hidden Layers']";
    public static final String LOAD_DELAY_LINK = "//a[text()='Load Delay']";
    public static final String AJAX_DATA_LINK = "//a[text()='AJAX Data']";
    public static final String CLIENT_SITE_DELAY_LINK = "//a[text()='Client Side Delay']";
    public static final String CLICK_LINK = "//a[text()='Click']";
    public static final String TEXT_INPUT_LINK = "//a[text()='Text Input']";
    public static final String SCROLLBARS_LINK = "//a[text()='Scrollbars']";
    public static final String DYNAMIC_TABLE_LINK = "//a[text()='Dynamic Table']";
    public static final String VERIFY_TEXT_LINK = "//a[text()='Verify Text']";
    public static final String PROGRESS_BAR_LINK = "//a[text()='Progress Bar']";
    public static final String SAMPLE_APP_PAGE = "//a[text()='Sample App']";
    public static final String MOUSE_OVER_LINK = "//a[text()='Mouse Over']";
    public static final String NON_BRAKING_SPACE_LINK = "//a[text()='Non-Breaking Space']";

    public void goToPageByLink(String locator) {
        $x(locator).shouldBe(Condition.visible).click();
        log().info("LINK OPENED");
    }
}
