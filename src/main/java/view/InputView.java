package view;

import domain.user.Player;

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

    public static int inputBettingMoney(String name) {
        String bettingMoney;
        while (true) {
            try {
                System.out.println(name + Constant.INPUT_BETTING_MONEY);
                bettingMoney = s.nextLine();
                // 예외
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return Integer.parseInt(bettingMoney);
    }

    public static boolean inputMoreCard(Player player) {
        String name = player.getName();
        String choice;
        boolean answer = true;
        while (true) {
            try {
                System.out.println(name + Constant.INPUT_MORE_CARD);
                choice = s.nextLine();
                // 예외
                // y -> true, n -> false
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return answer;
    }
}
