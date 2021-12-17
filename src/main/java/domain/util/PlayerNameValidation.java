package domain.util;

public class PlayerNameValidation {
    public static void isEmpty(String names) {
        if (names.length() == 0) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_EMPTY);
        }
    }

    public static void hasEmpty(String names) {
        if (names.contains(ValidationConstant.SPACE)) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_HAS_EMPTY);
        }
    }
}
