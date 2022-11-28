package baseball.validator;

import java.util.Arrays;

public class NumbersValidator {
    private static final String NON_NUMERIC_ERROR_MESSAGE = "숫자로만 입력 가능합니다.";
    private static final String INVALID_LENGTH_ERROR_MESSAGE = "숫자 3개를 입력해주세요.";
    private static final String DUPLICATE_ERROR_MESSAGE = "중복되지 않은 3개 숫자를 입력해주세요.";
    private static final String OUT_RANGE_ERROR_MESSAGE = "숫자는 1과 9 사이의 숫자입니다.";
    private static final int MAX_RANGE = 9;
    private static final int MIN_RANGE = 1;


    public static void validateNonNumeric(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NON_NUMERIC_ERROR_MESSAGE);
        }
    }

    public static void validationLength(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(INVALID_LENGTH_ERROR_MESSAGE);
        }
    }

    public static void validationDuplicate(String input) {
        String[] numbers = input.split("");
        if (numbers.length != Arrays.stream(numbers).distinct().count()) {
            throw new IllegalArgumentException(DUPLICATE_ERROR_MESSAGE);
        }
    }

    public static void validationRange(String input) {
        String[] numbers = input.split("");
        for (String number : numbers) {
            if (Integer.parseInt(number) < MIN_RANGE || Integer.parseInt(number) > MAX_RANGE) {
                throw new IllegalArgumentException(OUT_RANGE_ERROR_MESSAGE);
            }
        }
    }
}
