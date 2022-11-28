package baseball.view;

import baseball.domain.Numbers;
import camp.nextstep.edu.missionutils.Console;

import static baseball.validator.CommandValidator.validationRetryType;

public class InputView {
    public static Numbers readNumbers() {
        OutputView.printStartGameMessage();
        OutputView.printInputMessage();

        String input = Console.readLine();
        return new Numbers(input);
    }

    public static String readRetry() {
        OutputView.printRetryMessage();

        String input = Console.readLine();
        validationRetryType(input);
        return input;
    }
}
