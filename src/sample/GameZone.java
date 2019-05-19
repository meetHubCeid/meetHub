package sample;

import java.util.ArrayList;
import java.util.List;

public class GameZone {
    static List<Object> games = new ArrayList<Object>();


    public GameZone() {
        games.add(new SnakeAndLadders());
    }

    public void selectEntrance() {
    }

    public void showAvailiableGames() {
    }

    public void chooseGame() {
    }

}
