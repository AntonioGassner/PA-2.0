package Briscola;

import Library.GenericPlayer;

public abstract class IPlayer extends GenericPlayer {

    private int points;

    public IPlayer(String name) {
        super(name);
        this.points = 0;
    }

    public void incrementScore(int pointsToAdd) {
        this.points += pointsToAdd;
    }

    public int getPoints() {
        return points;
    }

}