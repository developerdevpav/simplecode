package by.devpav.difference_between_element_sum_and_digit_sum_of_an_array;

public class Solution {

    public int differenceOfSum(int[] nums) {
        int v = 0;
        int j = 0;

        for (int number : nums) {
            if (number >= 10) {
                int tmp = number;
                for (; tmp != 0; tmp=tmp/10) {
                    j += tmp%10;
                }
            } else {
                j += number;
            }
            v += number;
        }

        j = v - j;

        return j > 0 ? j : j * (-1);
    }
}
