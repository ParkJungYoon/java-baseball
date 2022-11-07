package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.validator.NumberValidator.validateRange;
import static baseball.validator.NumbersValidator.*;

public class Application {
    private final static String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    public static void main(String[] args) {
        List<Integer> computerNumbers = getComputerRandomNumbers();

        System.out.println(GAME_START_MESSAGE);
        System.out.print("숫자를 입력해주세요 : ");
        List<Integer> playerNumbers = getPlayerRandomNumbers();
    }

    static List<Integer> getPlayerRandomNumbers() {
        String input = Console.readLine();

        validateDigit(input);
        validateNonNumeric(input);

        List<Integer> player = new ArrayList<>();
        for (char inputChar : input.toCharArray()) {
            validateRange((int) inputChar);
            player.add((int) inputChar);
            System.out.println(player);
        }
        validateDuplicateNumber(player);
        return player;
    }

    static List<Integer> getComputerRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
