package domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    static List<Card> cards = new ArrayList<>();

    public static void create() {
        cards.addAll(CardFactory.create());
        Collections.shuffle(cards);
    }
}
