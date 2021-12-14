package Briscola;

public class Opponent extends IPlayer {

    public Opponent(String name) {
        super(name);
    }

    public void printHand() {
    }

    public int getCardChoice() {
        return Main.random.nextInt(cardsInHand()) + 1;
    }
}
