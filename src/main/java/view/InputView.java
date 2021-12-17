package view;

import domain.user.Player;
import domain.util.BettingMoneyValidation;
import domain.util.PlayerNameValidation;
import domain.util.PlusCardValidation;

import java.util.Scanner;

public class InputView {
    static Scanner s = new Scanner(System.in);

    public static String inputName() {
        String names;
        while (true) {
            try {
                System.out.println(Constant.INPUT_NAME);
                names = s.nextLine();
                PlayerNameValidation.validateName(names);
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
                BettingMoneyValidation.validateBettingMoney(bettingMoney);
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
                PlusCardValidation.validatePlusCard(choice);
                // y -> true, n -> false
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return answer;
    }
}
