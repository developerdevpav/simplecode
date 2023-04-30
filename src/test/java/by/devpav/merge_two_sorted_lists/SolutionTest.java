package by.devpav.merge_two_sorted_lists;

import by.devpav.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void testMergeTwoLists() {
        final var solution = new Solution();

        final var listNode = solution.mergeTwoLists(
                ListNode.bind(new int[] {-9, 3}),
                ListNode.bind(new int[] {5, 7})
        );

        Assertions.assertArrayEquals(new int[] { -9, 3, 5, 7 }, listNode.toArray());
    }

    @Test
    void testMergeTwoListsNull() {
        final var solution = new Solution();

        final var listNode = solution.mergeTwoLists(
                new ListNode(),
                new ListNode()
        );

        Assertions.assertArrayEquals(new int[] {0, 0}, listNode.toArray());
    }

}