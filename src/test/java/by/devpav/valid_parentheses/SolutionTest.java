package by.devpav.valid_parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isValid() {
        final var solution = new Solution();

        Assertions.assertTrue(solution.isValid("()"));
    }

    @Test
    void isValidA() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("({[)"));
    }

    @Test
    void isValidBracket() {
        final var solution = new Solution();

        Assertions.assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isNotValidBracket() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("(]"));
    }

    @Test
    void isNotVaflidBracket() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("(])"));
    }

    @Test
    void isNotVaflidBrackfet() {
        final var solution = new Solution();

        Assertions.assertTrue(solution.isValid("{[]}"));
    }

    @Test
    void isValidBracketC() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("]"));
    }

    @Test
    void isValidBracketA() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("(){}}{"));
    }

    @Test
    void isValidBracketP() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("[(]"));
    }

    @Test
    void isValidBracketN() {
        final var solution = new Solution();

        Assertions.assertTrue(solution.isValid("()"));
    }

    @Test
    void isValidBracketD() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid(")(){}"));
    }

    @Test
    void isValidBracketQ() {
        final var solution = new Solution();

        Assertions.assertFalse(solution.isValid("("));
    }
}