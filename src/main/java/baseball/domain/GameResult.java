package baseball.domain;

import baseball.view.OutputView;

public class GameResult {
    private int ballCount;
    private int strikeCount;

    public GameResult(int ball, int strike) {
        this.ballCount = ball;
        this.strikeCount = strike;
    }

    public void showResult() {
        OutputView.printResult(ballCount, strikeCount);
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "ballCount=" + ballCount +
                ", strikeCount=" + strikeCount +
                '}';
    }
}
