package by.devpav.find_the_index_of_the_first_occurrence_in_a_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        final var solution = new Solution();

        int i = solution.strStr("sadbutsad", "sad");

        Assertions.assertEquals(0, i);
    }

    @Test
    void strStrFailure() {
        final var solution = new Solution();

        int i = solution.strStr("butsgad", "sad");

        Assertions.assertEquals(-1, i);
    }

    @Test
    void strStrSuccess() {
        final var solution = new Solution();

        int i = solution.strStr("mississippi", "issip");

        Assertions.assertEquals(4, i);
    }

    @Test
    void strStrSuccesss() {
        final var solution = new Solution();

        int i = solution.strStr("mississippi", "issipi");

        Assertions.assertEquals(-1, i);
    }

    @Test
    void strStrSuccesssA() {
        final var solution = new Solution();

        int i = solution.strStr("a", "a");

        Assertions.assertEquals(0, i);
    }
}