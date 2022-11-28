package baseball.view;

public class OutputView {
    private static final String START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";

    public static void printStartGameMessage() {
        System.out.println(START_GAME_MESSAGE);
    }

    public static void printInputMessage() {
        System.out.print(INPUT_MESSAGE);
    }
}
