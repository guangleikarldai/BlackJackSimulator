package models;

/**
 * Created by gdai on 5/25/17.
 */
public class Card {
    public enum SUIT {
        DIAMOND, HEART, SPADE, CLUB
    }

    int value;

    SUIT suit;

    public Card(int value, SUIT suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }


    public boolean equals(Card card) {
        if (this.value == card.value && this.suit == card.suit) {
            return true;
        }

        return false;
    }
}
