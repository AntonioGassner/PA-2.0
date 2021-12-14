package Briscola;

public class Player extends IPlayer {

    public Player(String name) {
        super(name);
    }

    public int getCardChoice() {
        System.out.println("Pick a card to play");
        while (true) {
            int choice = Main.sc.nextInt();
            if (choice >= 1 && choice <= 3) {
                return choice;
            } else
                System.out.println("Please use {1,2,3} to pick a card ");
        }
    }

    public void printHand() {
        System.out.println("Cards in hand: ");

        for (Object card : getHand()) {
            System.out.println(card.toString());
        }
        System.out.println("------------------------------");
    }
}
