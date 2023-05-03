package by.devpav.add_binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    void addBinaryWhenSimple() {
        final var binary = SOLUTION.addSimpleBinary("1111101010", "1000");

        Assertions.assertEquals("1111110010", binary);
    }

}