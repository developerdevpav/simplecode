package by.devpav.roman_to_Integer;

public class RomanToInteger {

    private static final int[] SYMBOLS = new int[89];

    static {
        SYMBOLS['I'] = 1;
        SYMBOLS['V'] = 5;
        SYMBOLS['X'] = 10;
        SYMBOLS['L'] = 50;
        SYMBOLS['C'] = 100;
        SYMBOLS['D'] = 500;
        SYMBOLS['M'] = 1000;
    }

    public int romanToInt(String s) {
        final char[] chars = s.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC")
                .toCharArray();

        int value = 0;

        for (char item : chars) {
            value += SYMBOLS[item];
        }

        return value;
    }
}
