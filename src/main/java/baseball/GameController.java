package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class GameController {

    Computer computer = new Computer();
    public void start() {
        play();
    }

    private void play() {
        while (true) {
            computer.makeRandomNumber();
        }
    }
}
