package domain.util;

public class PlayerNameValidation {
    public static void isEmpty(String names) {
        if (names.length() == 0) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_EMPTY);
        }
    }

}
