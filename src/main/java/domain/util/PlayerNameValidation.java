package domain.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static void isDuplicated(List<String> nameList) {
        Set<String> nameSet = new HashSet<>(nameList);

        if (nameList.size() != nameSet.size()) {
            throw new IllegalArgumentException(ValidationConstant.ERROR_IS_DUPLICATED);
        }
    }
}
