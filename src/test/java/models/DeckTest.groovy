package models

import org.junit.Assert
import org.junit.Test

/**
 * Created by gdai on 5/25/17.
 */
class DeckTest extends GroovyTestCase {

    @Test
    public void CreateDeck() {
        Deck deck = new Deck();
        Assert.assertEquals(52, deck.getCards().length);
    }
}
