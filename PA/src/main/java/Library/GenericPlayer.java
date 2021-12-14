package Library;

import Briscola.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericPlayer {

    protected final String name;
    protected final List<Card> hand;

    public GenericPlayer(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    public abstract void printHand();

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public Card playCard() {
        Card cardPicked = hand.get(getCardChoice() - 1);
        hand.remove(cardPicked);
        return cardPicked;
    }

    protected abstract int getCardChoice();

    public int cardsInHand() {
        return this.hand.size();
    }

}
