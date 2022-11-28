package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readNumbers() {
        OutputView.printStartGameMessage();
        OutputView.printInputMessage();

        String input = Console.readLine();
        return input;
    }
}
