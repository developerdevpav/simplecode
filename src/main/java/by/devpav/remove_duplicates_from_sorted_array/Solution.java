package by.devpav.remove_duplicates_from_sorted_array;

public class Solution {

    public int removeDuplicates(int[] nums) {
        final int[] integers = new int[202];

        for (int i = 0; i < nums.length; i++) {
            int numValue = nums[i];

            if (numValue < 0) {
                int index = (numValue * -1) + 100;

                integers[index]++;

                if (integers[index] > 1)
                    flagElements(nums, i, (index - 100) * -1);
            } else {
                integers[numValue]++;
                if (integers[numValue] > 1)
                    flagElements(nums, i, nums[i]);
            }
        }

        int[] results = new int[nums.length];

        int j = 0;
        int k = 0;

        for (int num : nums) {
            if (num == -101) {
                j++;
            } else {
                results[k++] = num;
            }
        }

        System.arraycopy(results, 0, nums, 0, nums.length);

        return k;
    }

    private void flagElements(int[] elements, int startIndex, int element) {
        for (int i = startIndex; i < elements.length; i++)
            if (elements[i] == element)
                elements[i] = -101;
    }
}
