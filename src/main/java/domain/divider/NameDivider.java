package domain.divider;

import view.Constant;

import java.util.Arrays;
import java.util.List;

public class NameDivider {
    public static List<String> divideNames(String name) {
        List<String> names = Arrays.asList(name.split(Constant.DELIMITER));
        return names;
    }
}
