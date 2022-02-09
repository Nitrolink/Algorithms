package com.foundry.Advanced.Feb1;

import java.util.*;


public class Balls {
    public static String organizingContainers(List<List<Integer>> container) {
        HashMap<Long, Integer> sizes = new HashMap<>();;
        HashMap<Integer, Long> nums = new HashMap<>();

        for (List<Integer> rows : container) {
            Long size = (long) 0;
            for (int j = 0; j < rows.size(); j++) {
                nums.computeIfAbsent(j, k -> (long) 0);
                Long current = nums.get(j);
                nums.put(j, current + rows.get(j));

                size += rows.get(j);
            }
            if (!sizes.containsKey(size)) {
                sizes.put(size, 0);
            }
            sizes.put(size, sizes.get(size) + 1);
        }
        
        System.out.println("Size: " + sizes);
        System.out.println("Nums: "+ nums);
        for (Long qty: nums.values()) {
            if(!sizes.containsKey(qty)){
                return "Impossible";
            }
            if(sizes.get(qty)<=0){
                return "Impossible";
            }
            sizes.put(qty,sizes.get(qty)-1);
        }
        return "Possible";
    }
}
