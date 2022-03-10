package com.foundry.Advanced.a03_01;

import java.util.ArrayList;

public class composeRanges {
    String[] solution(int[] nums) {
        if(nums.length == 0){
            return new String[0];
        }
        ArrayList<String> ranges = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        r.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.println("r: "+r+",i: "+i);
            if (nums[i] - nums[i - 1] != 1) {
                System.out.println(r);
                if(r.size() == 1){
                    ranges.add(r.get(0).toString());
                }
                else{
                    ranges.add(r.get(0) + "->" + r.get(r.size() - 1));
                }
                r = new ArrayList<>();
            }
            r.add(nums[i]);
        }
        System.out.println("End r: " + r);
        if(r.size() == 1){
            ranges.add(r.get(0).toString());
        }
        else{
            ranges.add(r.get(0) + "->" + r.get(r.size() - 1));
        }
        System.out.println("End range: "+ ranges);
        return ranges.toArray(new String[0]);
    }

}
