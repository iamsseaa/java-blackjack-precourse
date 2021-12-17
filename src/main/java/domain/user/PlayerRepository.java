package domain.user;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }
}
