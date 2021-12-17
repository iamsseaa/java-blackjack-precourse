package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer {
    private final List<Card> cards = new ArrayList<>();
    public int finalMoney;

    public Dealer() {}

    public void addCard(Card card) {
        cards.add(card);
    }

    public void setFinalMoney(int money) {
        finalMoney = money;
    }

    public int getFinalMoney() {
        return finalMoney;
    }

    public String getSymbolType() {
        String answer = "";
        for (Card card : cards) {
            answer += card.getSymbolType();
            answer += " ";
        }
        return answer;
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }
}
