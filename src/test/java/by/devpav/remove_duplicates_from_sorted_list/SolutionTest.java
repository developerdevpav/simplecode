package by.devpav.remove_duplicates_from_sorted_list;

import by.devpav.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final static Solution SOLUTION = new Solution();

    @Test
    void deleteDuplicates() {
        final var listNode = SOLUTION.deleteDuplicates(ListNode.bind(new int[]{1, 1, 2}));

        Assertions.assertArrayEquals(new int[] {1, 2}, listNode.toArray());
    }

}