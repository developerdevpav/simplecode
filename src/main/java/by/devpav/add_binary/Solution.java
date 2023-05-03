package by.devpav.add_binary;

public class Solution {

    public static final int[][] SUM_BINARY = new int[2][2];

    static {
        SUM_BINARY[0][0] = 0;
        SUM_BINARY[0][1] = 1;
        SUM_BINARY[1][0] = 1;
        SUM_BINARY[1][1] = 10;
    }

    // TODO low performance
    public String addBinary(String a, String b) {
        return (a.length() > b.length())
                ? binaryPlus(b, a)
                : binaryPlus(a, b);
    }

    private String binaryPlus(final String min, final String max) {
        int i = 0;

        int remains = 0;

        final StringBuilder stringBuilder = new StringBuilder();

        while ((max.length() - 1) - i >= 0) {
            int first = max.charAt((max.length() - 1) - i) % 2;

            int index = (min.length() - 1) - i;

            int second = index >= 0 ? min.charAt(index) % 2 : 0;

            int sum = SUM_BINARY[first][second] + remains;

            remains = sum >= 2 ? 1 : 0;

            stringBuilder.append(sum % 2);

            i++;
        }

        if (remains > 0) {
            stringBuilder.append(remains);
        }

        return stringBuilder.reverse().toString();
    }
}
