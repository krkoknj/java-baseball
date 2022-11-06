package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class GameController {

    Computer computer = new Computer();
    Player player = new Player();
    public void start() {
        play();
    }

    private void play() {
        while (true) {
            View.gameStart();
            computer.makeRandomNumber();
            player.getValueInput();
            break;
        }
    }
}
