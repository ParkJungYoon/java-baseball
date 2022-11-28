package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import static baseball.validator.NumbersValidator.*;

public class Numbers {
    private final List<Integer> numbers;

    public Numbers(String numbers) {
        validateNonNumeric(numbers);
        validationLength(numbers);
        validationDuplicate(numbers);
        validationRange(numbers);

        this.numbers = transformInputNumbers(numbers);
    }

    private List<Integer> transformInputNumbers(String input) {
        ArrayList<Integer> transformNumbers = new ArrayList<>();
        for (char number : input.toCharArray()) {
            transformNumbers.add(Character.getNumericValue(number));
        }
        return transformNumbers;
    }
}
