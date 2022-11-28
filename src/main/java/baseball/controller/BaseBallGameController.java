package baseball.controller;

import baseball.domain.GameResult;
import baseball.domain.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Objects;

public class BaseBallGameController {
    private static Numbers computerNumbers;

    public void gameStart() {
        do {
            initComputerNumbers();
            oneGame();
        } while (retry());
    }

    private void initComputerNumbers() {
        computerNumbers = new Numbers();
    }

    private void oneGame() {
        GameResult result;
        do {
            Numbers playerNumbers = InputView.readNumbers();
            result = playerNumbers.compareToNumbers(computerNumbers);
            result.showResult();
        } while (!result.isSuccess());
        OutputView.printSuccessMessage();
    }

    private boolean retry() {
        return Objects.equals(InputView.readRetry(), "1");
    }
}
