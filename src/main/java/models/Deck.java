package models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by gdai on 5/25/17.
 */

public class Deck {
    private static final int DEK_SIZE = 52;
    Card[] cards;

    public Deck() {
        initCards();
    }

    private void initCards() {
        cards = new Card[DEK_SIZE];

        for (int i = 0; i < 4; i++) {
            Card.SUIT suit = Card.SUIT.values()[i];

            for (int value = 0; value < 13; value++) {
                Card card = new Card(value + 1, suit);
                cards[13 * i + value] = card;
            }
        }

        shuffleCards();
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void shuffleCards() {
        List<Card> list = Arrays.asList(cards);
        Collections.shuffle(list);
        cards = list.toArray(new Card[DEK_SIZE]);
    }

    public void print() {
        for (int i = 0; i < DEK_SIZE; i++) {
            System.out.println(cards[i].getSuit() + " " + cards[i].getValue());
        }
    }
}
