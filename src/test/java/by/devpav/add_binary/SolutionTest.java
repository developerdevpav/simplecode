package by.devpav.add_binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    void addBinaryWhenSimple() {
        final var binary = SOLUTION.addSimpleBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");

        Assertions.assertEquals("11110", binary);
    }

    @Test
    void reverse() {
        final var binary = SOLUTION.reverse(new char[] { '1', '0', '2' });

        Assertions.assertEquals("0", binary);
    }
}