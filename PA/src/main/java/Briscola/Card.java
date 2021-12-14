package Briscola;

import Library.GenericCard;

public class Card extends GenericCard{

    private final int pointValue;

    public Card(Suit suit, int rank, int pointValue) {
       super(suit, rank);
        this.pointValue = pointValue;
    }

    public int getRank() {
        return rank;
    }

    public int getPointValue() {
        return pointValue;
    }

    @Override
    public String toString() {
        return rankToString() + " di " + suitToString();
    }

    public String suitToString() {
        switch (this.suit) {
            case COPPE:
                return "Coppe";
            case SPADE:
                return "Spade";
            case DANARI:
                return "Danari";
            case BASTONI:
                return "Bastoni";
        }
        return "Error";
    }


    public String rankToString() {
        switch (this.rank) {
            case 0:
                return "Asso";
            case 1:
                return "Tre";
            case 2:
                return "Re";
            case 3:
                return "Cavallo";
            case 4:
                return "Fante";
            case 5:
                return "Sette";
            case 6:
                return "Sei";
            case 7:
                return "Cinque";
            case 8:
                return "Quattro";
            case 9:
                return "Due";
        }
        return "Error";
    }

}
