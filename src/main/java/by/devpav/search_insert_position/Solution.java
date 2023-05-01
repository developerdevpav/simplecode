package by.devpav.search_insert_position;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middleIndex = left + (right - left) / 2;

            int number = nums[middleIndex];

            if (number == target) {
                return middleIndex;
            } else if (number > target) {
                right = middleIndex - 1;
            } else {
                left = middleIndex + 1;
            }
        }

        return left;
    }
}

// [0, 1, 3, 4, 5, 6]
