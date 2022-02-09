package com.foundry.Advanced.a02_08;

import java.util.*;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
         TreeMap<Integer, Integer> birdCount = new TreeMap<>(Map.of(1, 0, 2, 0, 3, 0, 4, 0, 5, 0));
        System.out.println(birdCount);
        for (int bird:arr) {
            birdCount.put(bird,birdCount.get(bird)+1);
        }

        int max=(Collections.max(birdCount.values()));
        for(Integer key: birdCount.keySet()){
            if(birdCount.get(key)==max){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1,2,3,4,5,4,3)););
    }
}
