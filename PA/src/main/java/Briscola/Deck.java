package Briscola;

import Library.GenericDeck;

public class Deck extends GenericDeck {

    @Override
    public void createDeck() {
        while (deck.size() < 40) {
            for (int i = 0; i <= 9; i++) {
                int pointValue = 0;
                if (i == 0)
                    pointValue = 11;
                if (i == 1)
                    pointValue = 10;
                if (i == 2)
                    pointValue = 4;
                if (i == 3)
                    pointValue = 3;
                if (i == 4)
                    pointValue = 2;

                deck.push(new Card(Suit.BASTONI, i, pointValue));
                deck.push(new Card(Suit.COPPE, i, pointValue));
                deck.push(new Card(Suit.SPADE, i, pointValue));
                deck.push(new Card(Suit.DANARI, i, pointValue));
            }

        }
    }

    public Suit getTrumpSuit() {
        return this.deck.lastElement().getSuit();
    }

}
