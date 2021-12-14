package Library;

import Briscola.IPlayer;

public interface IGame {

    public void playGame();

    public int comparePoints(IPlayer[] playersArray);

}
