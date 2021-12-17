package view;

import domain.user.Dealer;
import domain.user.Player;
import domain.user.PlayerRepository;
import domain.util.ValidationConstant;

import java.util.List;

public class OutputView {
    public static void outputDividedTwoCards() {
        System.out.print(Constant.DEALER + Constant.AND);
        for (Player player : PlayerRepository.getPlayers()) {
            System.out.print(player.getName());
            System.out.print(Constant.DELIMITER);
        }
        System.out.println(Constant.OUTPUT_DIVIDED_CARD);
    }

    public static void outputPrintTwoCards(Dealer dealer) {
        System.out.println(Constant.DEALER_CARD + dealer.getSymbolType());
        for (Player player : PlayerRepository.getPlayers()) {
            System.out.println(player.getName() + Constant.PLAYER_CARD + player.getPlayerSymbolType());
        }
    }

    public static void outputDealerUnderSixteen() {
        System.out.println(Constant.OUTPUT_DEALER_UNDER_SIXTEEN);
    }
}
