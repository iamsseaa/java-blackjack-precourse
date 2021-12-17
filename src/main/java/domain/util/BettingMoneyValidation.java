package domain.util;

public class BettingMoneyValidation {
    public static void isNumber(String bettingMoney) {
        if (!bettingMoney.matches("-?\\d+")) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_NOT_NUMBER);
        }
    }
    
}
