package domain.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerRepository {
    List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}
