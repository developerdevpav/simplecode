package by.devpav.sign_of_the_product_of_an_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final static Solution SOLUTION = new Solution();

    @Test
    void arraySignPositive() {
        int i = SOLUTION.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1});

        Assertions.assertEquals(1, i);
    }

    @Test
    void arraySignNegative() {
        int i = SOLUTION.arraySign(new int[]{-1, 1, -1, 1, -1});

        Assertions.assertEquals(-1, i);
    }

    @Test
    void arraySignZero() {
        int i = SOLUTION.arraySign(new int[]{1, 5, 0, 2, -3});

        Assertions.assertEquals(0, i);
    }
}