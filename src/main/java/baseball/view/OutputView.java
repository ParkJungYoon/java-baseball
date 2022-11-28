package baseball.view;

import java.util.ArrayList;

public class OutputView {
    private static final String START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String BALL_MESSAGE = "%d볼";
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RETRY_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public static void printStartGameMessage() {
        System.out.println(START_GAME_MESSAGE);
    }

    public static void printInputMessage() {
        System.out.print(INPUT_MESSAGE);
    }

    public static void printResult(int ballCount, int strikeCount) {
        ArrayList<String> result = new ArrayList<>();
        if (ballCount == 0 && strikeCount == 0) result.add(NOTHING_MESSAGE);
        if (ballCount != 0) result.add(String.format(BALL_MESSAGE, ballCount));
        if (strikeCount != 0) result.add(String.format(STRIKE_MESSAGE, strikeCount));

        System.out.println(String.join(" ", result));
    }

    public static void printSuccessMessage() {
        System.out.println(SUCCESS_MESSAGE);
    }

    public static void printRetryMessage() {
        System.out.println(RETRY_MESSAGE);
    }

}
