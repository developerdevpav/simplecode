package by.devpav.add_to_numbers;

import by.devpav.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        final var firstNode = ListNode.bind(new int[]{9, 9, 9, 9, 9, 9, 9}); // 9999999
        final var secondNode = ListNode.bind(new int[]{9, 9, 9, 9}); // 9999

        final var solution = new Solution();

        final var listNode = solution.addTwoNumbers(firstNode, secondNode);

        Assertions.assertArrayEquals(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 }, listNode.toArray());
    }

}