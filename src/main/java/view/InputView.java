package view;

import java.util.Scanner;

public class InputView {
    static Scanner s = new Scanner(System.in);

    public static String inputName() {
        String names;
        while (true) {
            try {
                System.out.println(Constant.INPUT_NAME);
                names = s.nextLine();
                // 예외
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return names;
    }
}
