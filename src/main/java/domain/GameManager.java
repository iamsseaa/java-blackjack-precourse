package domain;

import domain.card.Card;
import domain.card.Deck;
import domain.divider.NameDivider;
import domain.user.Dealer;
import domain.user.Player;
import domain.user.PlayerRepository;
import view.InputView;

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
    }
}
