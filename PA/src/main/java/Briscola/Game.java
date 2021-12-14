package Briscola;

import Library.IGame;

public class Game implements IGame {

    private Suit trump;
    private int nPlayers;


    public void playGame() {

        nPlayers = Main.io.getNumberOfPlayers();
        String playerName = Main.io.getPlayerName();

        int turns = 40 / nPlayers;
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffle();
        trump = deck.getTrumpSuit();

        IPlayer[] playersArray = new IPlayer[nPlayers];
        Player player = new Player(playerName);
        playersArray[0] = player;
        Opponent oppo1 = new Opponent("Opponent 1");
        playersArray[1] = oppo1;
        if (nPlayers == 4) {
            playersArray[2] = new Opponent("Opponent 2");
            playersArray[3] = new Opponent("Opponent 3");
        }
        int pointer = Main.random.nextInt(nPlayers - 1);

        //Each player draws opening hand
        for (int i = 0; i < nPlayers * 3; i++) {
            int j = (i + pointer) % nPlayers;
            playersArray[j].drawCard((Card) deck.drawFirstCard());
        }

        int first = pointer;

        while (turns > 0) {

            System.out.println("==============================");
            System.out.println("Turn " + (21 - turns) + ", Trump is: " + this.trump);
            System.out.println(playersArray[pointer].getName() + " begins first");
            System.out.println("------------------------------");
            int playPoints = 0;
            Card[] cardsArray = new Card[nPlayers];

            for (int i = 0; i < nPlayers; i++) {
                playersArray[pointer].printHand();
                cardsArray[i] = playersArray[pointer].playCard();
                System.out.println(playersArray[pointer].getName() + " played " + cardsArray[i].toString());
                playPoints += cardsArray[i].getPointValue();
                pointer = (pointer + 1) % nPlayers;
            }

            first = (first + nextFirst(cardsArray)) % nPlayers;

            playersArray[first].incrementScore(playPoints);

            if (!deck.isEmpty()) {
                for (int i = 0; i < nPlayers; i++) {
                    int j = (first + i) % nPlayers;
                    playersArray[j].drawCard((Card) deck.drawFirstCard());
                }
            }
            pointer = first;
            turns--;
        }

        int winner = comparePoints(playersArray);
        System.out.println("==============================");
        System.out.println("\nWinner is: " + playersArray[winner].getName() + " with " + playersArray[winner].getPoints() + " points!");
        System.out.println("\n==============================");

    }

    public int comparePoints(IPlayer[] playersArray) {
        int highest = 0;
        int pointer = 0;
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[i].getPoints() > highest) {
                highest = playersArray[i].getPoints();
                pointer = i;
            }
        }
        return pointer;
    }

    public int nextFirst(Card[] cards) {
        int counter = 0;
        for (int i = 0; i < cards.length - 1; i++) {
            Card a = cards[i];
            Card b = cards[i + 1];
            if (!compareCards(a, b)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean compareCards(Card a, Card b) {
        if (a.getSuit() == b.getSuit())
            return a.getRank() < b.getRank();
        return b.getSuit() != this.trump;
    }
}
