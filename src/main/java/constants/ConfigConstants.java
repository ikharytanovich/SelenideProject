package constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ConfigConstants {
    DRIVER_NAME("webdriver.chrome.driver"),
    DRIVER_PATH("src/main/resources/chromedriver.exe");

    @Getter
    private final String src;
}
