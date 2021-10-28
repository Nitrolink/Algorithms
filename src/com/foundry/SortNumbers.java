package com.foundry;

public class SortNumbers {
    //https://edabit.com/challenge/WM5s7vuHnXdcKCEjS
    public static int[] sortNumsAscending(int[] nums) {
        boolean finished = false;
        int tempInt;
        while (!finished) {
            finished = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    tempInt = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tempInt;
                    finished = false;
                }
            }
        }
        return nums;
    }
}
