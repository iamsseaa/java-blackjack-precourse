package domain.util;

public class BettingMoneyValidation {
    public static void validateBettingMoney(String bettingMoney) {
        isNumber(bettingMoney);
        isPositive(bettingMoney);
    }

    public static void isNumber(String bettingMoney) {
        if (!bettingMoney.matches("-?\\d+")) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_NOT_NUMBER);
        }
    }

    public static void isPositive(String bettingMoney) {
        if (Integer.parseInt(bettingMoney) < 0) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_NOT_POSITIVE);
        }
    }
}
