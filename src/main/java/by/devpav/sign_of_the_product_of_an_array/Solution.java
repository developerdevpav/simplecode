package by.devpav.sign_of_the_product_of_an_array;

public class Solution {

    public int arraySign(int[] nums) {
        int val = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            val = val * ((num < 0) ? (-1) : 1);
        }

        return val;
    }

    public int arraySignCount(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) i++;
        }

        return i % 2 != 0 ? -1 : 1;
    }

}
