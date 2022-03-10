package com.foundry.Advanced.a03_01;

public class houseRobber {
    int solution(int[] nums) {
        int l = nums.length;
        switch (l) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            case 2:
                return Math.max(nums[0],nums[1]);
        }
        int max = 0;
        int one = nums[0];
        int two = Math.max(nums[0],nums[1]);
        for (int i = 2; i < l; i++) {
            max= Math.max(nums[i]+one, two);
            one = two;
            two = max;
        }
        return max;
    }
}
