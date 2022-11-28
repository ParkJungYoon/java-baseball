package baseball.controller;

import baseball.domain.GameResult;
import baseball.domain.Numbers;
import baseball.view.InputView;

public class BaseBallGameController {
    private static Numbers computerNumbers;

    public void gameStart() {
        initComputerNumbers();
        System.out.println(computerNumbers.toString());
        oneGame();
    }
    private void initComputerNumbers() {
        computerNumbers = new Numbers();
    }

    private void oneGame() {
        Numbers playerNumbers = InputView.readNumbers();
        GameResult result = playerNumbers.compareToNumbers(computerNumbers);
        System.out.println(result.toString());
        result.showResult();
    }
}
