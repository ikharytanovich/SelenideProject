package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TestsIntegersConstants {
    PROGRESS_BAR_VALUE(75),
    TIMES_TO_CLICK(2),
    WAIT_25_SECONDS(25);

    @Getter
    private final int value;
}
