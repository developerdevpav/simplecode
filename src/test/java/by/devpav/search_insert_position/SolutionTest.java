package by.devpav.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final static Solution solution = new Solution();

    @Test
    public void searchInsert() {
        int i = solution.searchInsert(new int[]{1, 3, 5}, 3);

        assertEquals(1, i);
    }
}