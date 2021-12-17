import domain.card.Card;
import domain.card.Deck;
import domain.divider.NameDivider;
import domain.score.ScoreCalculator;
import domain.user.Dealer;
import domain.user.Player;
import domain.user.PlayerRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    static Dealer dealer = new Dealer();

    public static void play() {

    }

    public static void enrollPlayers() {
        String names = InputView.inputName();
        List<String> nameList = NameDivider.divideNames(names);

        for (String name : nameList) {
            int bettingMoney = InputView.inputBettingMoney(name);
            Player player = new Player(name, bettingMoney);
            PlayerRepository.addPlayer(player);
        }
    }

    public static void makeDealerTwoCards() {
        Deck.create();

        for (int i=0; i<2; i++) {
            Card card = Deck.pickCard();
            dealer.addCard(card);
        }
    }

    public static void makePlayerTwoCards() {
        for (Player player : PlayerRepository.getPlayers()) {
            Card card = Deck.pickCard();
            player.addCard(card);
        }
        OutputView.outputDividedTwoCards();
    }

    public static void askMoreCard() {
        for (Player player : PlayerRepository.getPlayers()) {
            while (InputView.inputMoreCard(player)) {
                addMoreCard(player);
            }
        }
    }

    public static void addMoreCard(Player player) {
        player.addCard(Deck.pickCard());
        OutputView.printPlayerCards(player);
    }

    public static void addDealerMoreCard() {
        if (ScoreCalculator.getScore(dealer.getCards()) <= 16) {
            dealer.addCard(Deck.pickCard());
        }
        OutputView.outputDealerUnderSixteen();
    }
}
