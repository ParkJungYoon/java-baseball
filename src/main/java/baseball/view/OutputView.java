package baseball.view;

import java.util.ArrayList;

public class OutputView {
    private static final String START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String BALL_MESSAGE = "%d볼";
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";


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
}
