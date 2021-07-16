package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TestIntegerConstants {
    PROGRESS_BAR_VALUE(75),
    TIMES_TO_CLICK(2);

    @Getter
    private final int value;
}
