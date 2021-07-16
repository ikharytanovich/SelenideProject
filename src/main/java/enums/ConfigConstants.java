package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ConfigConstants {
    MAIN_URL("http://www.uitestingplayground.com/"),
    DRIVER_NAME("webdriver.chrome.driver"),
    DRIVER_PATH("src/main/resources/chromedriver.exe");

    @Getter
    private final String value;
}
