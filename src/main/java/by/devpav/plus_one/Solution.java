package by.devpav.plus_one;

public class Solution {

    public int[] plusOne(int[] digits) {
        int[] minArr = new int[] { 1 };
        int[] result = new int[digits.length];

        int indexMinArr = minArr.length - 1;
        int indexdigits = digits.length - 1;

        int remains = 0;

        do {
            int numdigitsay = digits[indexdigits];
            int numMinArray = minArr[indexMinArr];

            int sum = numdigitsay + numMinArray;

            sum = sum + remains;

            if (sum > 9) {
                remains = 1;
                sum = sum - 10;
            } else {
                remains = 0;
            }

            result[indexdigits] = sum;

            indexdigits--;
            indexMinArr--;
        } while (indexMinArr >= 0);

        if (remains > 0) {
            if (indexdigits < 0) {
                digits = arrayExtend(digits);
                result = arrayExtend(result);
                indexdigits = 0;
            }

            while (indexdigits >= 0) {
                int sum = digits[indexdigits] + remains;

                if (sum > 9) {
                    remains = 1;
                    sum = sum - 10;
                } else {
                    remains = 0;
                }

                if (remains > 0 && indexdigits == 0) {
                    digits = arrayExtend(digits);
                    digits[indexdigits] = remains;
                    result = arrayExtend(result);
                    result[indexdigits] = remains;
                } else {
                    result[indexdigits] = sum;
                }

                indexdigits--;
            }
        } else {
            while (indexdigits >= 0) {
                result[indexdigits] = digits[indexdigits];
                indexdigits--;
            }
        }

        return result;
    }

    private int[] arrayExtend(int[] maxArr) {
        int[] tmp = new int[maxArr.length + 1];

        for (int i = 0; i < maxArr.length; i++) {
            tmp[i + 1] = maxArr[i];
        }

        return tmp;
    }

}
