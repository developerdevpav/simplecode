package by.devpav.concatenation_of_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    void getConcatenation() {
        int[] concatenation = SOLUTION.getConcatenation(new int[]{1, 3, 2, 1});

        Assertions.assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, concatenation);
    }

}