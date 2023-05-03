package by.devpav.build_array_from_permutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    void buildArray() {
        int[] ints = SOLUTION.buildArray(new int[]{5, 0, 1, 2, 3, 4});

        Assertions.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, ints);
    }

}