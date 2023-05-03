package by.devpav.difference_between_element_sum_and_digit_sum_of_an_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    void differenceOfSum() {
        int count = SOLUTION.differenceOfSum(new int[]{1, 15, 6, 3});

        Assertions.assertEquals(9, count);

    }
}