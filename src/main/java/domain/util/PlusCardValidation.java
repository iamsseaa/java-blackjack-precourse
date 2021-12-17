package domain.util;

public class PlusCardValidation {
    public static void validatePlusCard(String answer) {
        if (!answer.equals(ValidationConstant.YES) && !answer.equals(ValidationConstant.NO)) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_NOT_Y_N);
        }
    }

    public static boolean returnBoolean(String answer) {
        if (answer.equals(ValidationConstant.YES)) {
            return true;
        }
        return false;
    }
}
