package by.devpav.remove_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void removeElement() {
        final var solution = new Solution();

        final int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        final int count = solution.removeElement(nums, 2);

        Assertions.assertEquals(5, count);

        final int[] dest = new int[count];

        System.arraycopy(nums, 0, dest, 0, count);

        Assertions.assertArrayEquals(new int[]{0, 1, 3, 0, 4}, dest);
    }

}
