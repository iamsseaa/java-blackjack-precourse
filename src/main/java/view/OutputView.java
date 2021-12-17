package view;

import domain.user.Dealer;
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

    public static void outputPrintTwoCards(Dealer dealer) {
        System.out.println(Constant.DEALER_CARD + dealer.getSymbolType());
    }

    public static void outputDealerUnderSixteen() {
        System.out.println(Constant.OUTPUT_DEALER_UNDER_SIXTEEN);
    }
}
