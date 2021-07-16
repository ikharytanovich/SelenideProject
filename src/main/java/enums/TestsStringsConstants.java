package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TestsStringsConstants {
    USER_NAME("user name"),
    PASSWORD("pwd"),
    INPUT("INPUT111000111"),
    DYNAMIC_TABLE_HEADER("CPU"),
    DYNAMIC_TABLE_ROW("Chrome");

    @Getter
    private final String value;
}
