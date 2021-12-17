package domain.score;

import domain.card.Card;

import java.util.List;

public class ScoreCalculator {
    public static int getScore(List<Card> cards) {
        int score = 0;

        for (Card card : cards) {
            score += card.getScore();
        }
        return score;
    }
}
