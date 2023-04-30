package by.devpav.roman_to_Integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();

        final int value = romanToInteger.romanToInt("MCMXCIV");

        Assertions.assertEquals(1994, value);
    }

}