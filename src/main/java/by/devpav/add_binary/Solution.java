package by.devpav.add_binary;

public class Solution {

    public static final int[][] SUM_BINARY = new int[2][2];

    static {
        SUM_BINARY[0][0] = 0;
        SUM_BINARY[0][1] = 1;
        SUM_BINARY[1][0] = 1;
        SUM_BINARY[1][1] = 10;
    }

    public String addSimpleBinary(String a, String b) {
        return (a.length() > b.length())
                ? binaryPlus(b, a)
                : binaryPlus(a, b);
    }

    private String binaryPlus(final String min, final String max) {
        int[] result = new int[max.length()];

        int i = 0;

        int remains = 0;

        while ((max.length() - 1) - i >= 0) {
            int first = Character.getNumericValue(max.charAt((max.length() - 1) - i));

            int index = (min.length() - 1) - i;

            int second = index >= 0 ? Character.getNumericValue(min.charAt(index)) : 0;

            int sum = SUM_BINARY[first][second] + remains;

            if (sum > 1 && sum < 10) {
                sum = 0;
            }

            final String s = String.valueOf(sum);
            int res = Character.getNumericValue(s.charAt(s.length() - 1));

            remains = SUM_BINARY[first][second] + remains >= 2 ? 1 : 0;

            result[i++] = res;
        }

        if (remains > 0) {
            int[] tmp = new int[result.length + 1];
            System.arraycopy(result, 0, tmp, 0, result.length);
            tmp[tmp.length - 1] = remains;
            result = tmp;
        }

        StringBuilder stringBuilder = new StringBuilder();

        int[] reverseResult = reverse(result);
        for (final int num : reverseResult) {
            stringBuilder.append(num);
        }

        return stringBuilder.toString();
    }

    public int[] reverse(final int[] nums) {
        int length = nums.length;

        if (length == 0 || length == 1) {
            return nums;
        }

        for (int i = 0; length - i > i; i++) {
            int tmp = nums[i];
            nums[i] = nums[length - 1 - i];
            nums[length - 1 - i] = tmp;
        }

        return nums;
    }
}
