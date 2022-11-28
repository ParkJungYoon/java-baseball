package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import static baseball.validator.NumbersValidator.*;

public class Numbers {
    private List<Integer> numbers;

    public Numbers() {
        GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
        this.numbers = generateRandomNumbers.generate();
    }

    public Numbers(String input) {
        validateNonNumeric(input);
        validationLength(input);
        validationDuplicate(input);
        validationRange(input);

        this.numbers = transformInputNumbers(input);
    }

    private List<Integer> transformInputNumbers(String input) {
        ArrayList<Integer> transformNumbers = new ArrayList<>();
        for (char number : input.toCharArray()) {
            transformNumbers.add(Character.getNumericValue(number));
        }
        return transformNumbers;
    }

    // 볼 개수랑 스트라이크 개수 받아와서 result에 저장하는 메서드
    public GameResult compareToNumbers(Numbers inputNumbers) {
        return new GameResult(countBall(inputNumbers), countStrike(inputNumbers));
    }

    private boolean isSamePosition(int number, int position) {
        return position == numbers.indexOf(number);
    }

    private boolean isContainNumber(int number, int position) {
        return position != numbers.indexOf(number) && numbers.contains(number);
    }

    private int countBall(Numbers inputNumbers) {
        int ball = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (inputNumbers.isContainNumber(numbers.get(i), i)) {
                ball++;
            }
        }
        return ball;
    }

    private int countStrike(Numbers inputNumbers) {
        int strike = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (inputNumbers.isSamePosition(numbers.get(i), i)) {
                strike++;
            }
        }
        return strike;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }
}
