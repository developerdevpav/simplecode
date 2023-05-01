package by.devpav.length_of_last_word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLastWord() {
        final var solution = new Solution();

        int spaceValue = solution.lengthOfLastWord("Space value     ");

        Assertions.assertEquals(5, spaceValue);
    }

}