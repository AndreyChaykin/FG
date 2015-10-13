package fantasygame;

import fantasygame.arena.Arena;
import fantasygame.hero.ChiefJustice;

public class StartGame {
    public static void main(String[] args) {
//todo absendexc
        Arena fantasyGame = new Arena(new ChiefJustice());

            fantasyGame.startGame();

    }
}
