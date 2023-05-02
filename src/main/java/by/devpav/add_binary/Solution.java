package by.devpav.add_binary;

public class Solution {


    public String addSimpleBinary(String a, String b) {
        final int value = toDecimal(a) + toDecimal(b);

        return toBinary(value);
    }

    private String toBinary(final int value) {
        if (value == 0) {
            return "0";
        }

        int remains = value;

        final var stringBuilder = new StringBuilder();

        int dwr;
        while (remains >= 2) {
            dwr = remains % 2;
            remains = remains / 2;

            stringBuilder.append(dwr);
        };

        stringBuilder.append(remains % 2);

        return stringBuilder.reverse().toString();
    }

    private int toDecimal(final String content) {
        int result = 0;

        final char[] chars = reverse(content.toCharArray());

        for (int i = 0; i < chars.length; i++) {
            final var number = Integer.parseInt(String.valueOf(chars[i]));

            if (number != 0) {
                final int pow = pow(2, i);
                result += (number * pow);
            }
        }

        return result;
    }

    public char[] reverse(final char[] chars) {
        int length = chars.length;

        if (length == 0 || length == 1) {
            return chars;
        }

        for (int i = 0; length - i > i; i++) {
            char tmp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = tmp;
        }

        return chars;
    }

    private int pow(final int number, final int degree) {
        if (degree == 0) {
            return 1;
        }

        if (degree == 1) {
            return number;
        }

        int result = number;

        for (int i = 0; i < degree - 1; i++) {
            result *= 2;
        }

        return result;
    }

}
