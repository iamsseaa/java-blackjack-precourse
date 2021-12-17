package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player {
    private final String name;
    private final int bettingMoney;
    private final List<Card> cards = new ArrayList<>();
    public int finalMoney;

    public Player(String name, int bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void setFinalMoney(int money) {
        finalMoney = money;
    }

    public int getFinalMoney() {
        return finalMoney;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public String getPlayerSymbolType() {
        String answer = "";
        for (Card card : cards) {
            answer += card.getSymbolType();
            answer += " ";
        }
        return answer;
    }
}
