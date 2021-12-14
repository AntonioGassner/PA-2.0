package Library;

import java.util.Collections;
import java.util.Stack;


public class GenericDeck {

    protected final Stack<GenericCard> deck;

    public GenericDeck() {
        this.deck = new Stack<>();
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public void createDeck() {}

    public GenericCard drawFirstCard() {
        return this.deck.pop();
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }

}
