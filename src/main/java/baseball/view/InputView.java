package baseball.view;

import baseball.domain.Numbers;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static Numbers readNumbers() {
        OutputView.printStartGameMessage();
        OutputView.printInputMessage();

        String input = Console.readLine();
        return new Numbers(input);
    }
}
