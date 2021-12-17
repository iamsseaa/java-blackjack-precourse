package domain;

import domain.divider.NameDivider;
import domain.user.Player;
import domain.user.PlayerRepository;
import view.InputView;

import java.util.List;

public class GameManager {
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
}
