package media.barney.utils.unit;

import java.util.Objects;

final class UnitInputValidator {

    private UnitInputValidator() {
    }

    static double requireNonNegativeFinite(double value) {
        if (value < 0 || !Double.isFinite(value)) {
            throw new IllegalArgumentException("value must be a non-negative finite number");
        }
        return value;
    }

    static int requirePositiveBitsPerByte(int bitsPerByte) {
        if (bitsPerByte <= 0) {
            throw new IllegalArgumentException("bitsPerByte must be greater than 0");
        }
        return bitsPerByte;
    }

    static <T> T requireNonNull(T value, String name) {
        return Objects.requireNonNull(value, name);
    }
}
