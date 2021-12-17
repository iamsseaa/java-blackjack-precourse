package domain.util;

public class ValidationConstant {

    public static final String ERROR = "[ERROR] ";

    public static final String SPACE = " ";

    public static final String ERROR_IS_EMPTY = ERROR + "아무것도 입력되지 않았습니다.";
    public static final String ERROR_HAS_EMPTY = ERROR + "이름에 공백이 존재하면 안됩니다.";
    public static final String ERROR_IS_DUPLICATED = ERROR + "이름이 중복됩니다.";

    public static final String ERROR_IS_NOT_NUMBER = ERROR + "베팅 금액은 정수여야합니다.";
    public static final String ERROR_IS_NOT_POSITIVE = ERROR + "베팅 금액은 1원 이상부터 가능합니다.";

    public static final String ERROR_IS_NOT_Y_N = ERROR + "y 또는 n만 입력 가능합니다.";
}