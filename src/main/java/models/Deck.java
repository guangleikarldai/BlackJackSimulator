package models;

/**
 * Created by gdai on 5/25/17.
 */

public class Deck {
    Card[] cards;

    public Deck() {
        initCards();
    }

    private void initCards() {
        cards = new Card[52];

        for (int i = 0; i < 4; i++) {
            Card.SUIT suit = Card.SUIT.values()[i];

            for (int value = 0; value < 13; value++) {
                Card card = new Card(value, suit);
                cards[13 * i + value] = card;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
