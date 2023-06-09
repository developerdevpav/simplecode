package by.devpav.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void removeDuplicates() {
        final Solution solution = new Solution();

        final int[] nums = { 0, 1, 2, 2, 2, 2, 3, 4, 5, 6 };

        solution.removeDuplicates(nums);

        Assertions.assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 0, 0, 0 }, nums);
    }

}