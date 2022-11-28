package baseball.validator;

public class NumbersValidator {
    private static final String NON_NUMERIC_ERROR_MESSAGE = "숫자로만 입력 가능합니다.";

    public static void validateNonNumeric(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NON_NUMERIC_ERROR_MESSAGE);
        }
    }
}
