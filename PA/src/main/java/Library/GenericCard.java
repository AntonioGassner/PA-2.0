package Library;

import Briscola.Suit;

public class GenericCard {

    protected final Suit suit;
    protected final int rank;

    public GenericCard(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
