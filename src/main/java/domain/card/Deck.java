package domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    static List<Card> cards = new ArrayList<>();

    public static void create() {
        cards.addAll(CardFactory.create());
        Collections.shuffle(cards);
    }

    public static Card pickCard() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
