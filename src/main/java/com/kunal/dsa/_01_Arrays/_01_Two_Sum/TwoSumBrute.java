package main.java.com.kunal.dsa._01_Arrays._01_Two_Sum;

import java.util.Arrays;

public class TwoSumBrute {
        /*
        Because we are using two Nested loops The time complexity will be O(N^2)
        and SPace complexity will be O(N) cause we didn't use any extra space
         */
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 15, 11, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

