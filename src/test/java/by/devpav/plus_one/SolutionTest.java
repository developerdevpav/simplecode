package by.devpav.plus_one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Solution solution = new Solution();

    @Test
    void plusOne() {
        int[] ints = solution.plusOne(new int[]{9, 9, 9, 9, 9, 9, 9});

        Assertions.assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0}, ints);
    }

}