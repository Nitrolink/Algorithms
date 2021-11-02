package com.foundry;

import java.util.Arrays;

public class HotSeat {
    public static int[] sortNumsAscending(int[] nums) {
        if(Arrays.equals(nums, new int[0]) || Arrays.equals(nums, null)){
            return new int[0];
        }
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return nums;
    }
}

