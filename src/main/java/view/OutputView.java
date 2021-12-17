package view;

import domain.user.Player;

import java.util.List;

public class OutputView {
    public static void outputDividedTwoCards(List<Player> players) {
        System.out.print(Constant.DEALER + Constant.AND);
        for (Player player : players) {
            System.out.print(player.getName());
            System.out.print(Constant.DELIMITER);
        }
        System.out.println(Constant.OUTPUT_DIVIDED_CARD);
    }
}
