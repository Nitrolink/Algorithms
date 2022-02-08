package com.foundry.Advanced.Feb1;

import java.util.*;


public class Balls {

    public static String organizingContainers(List<List<Integer>> container) {
        HashMap<Integer, Long> sizes = new HashMap<>();;
        HashMap<Integer, Long> nums = new HashMap<>();

        for (int i = 0; i < container.size(); i++) {//Loops through the containers
            Long size = (long) 0; //Initial value for size in this container
            for (int j = 0; j < container.get(i).size(); j++) {//Loops through the ball types in the container
                nums.computeIfAbsent(j, k -> (long) 0); //Makes index for container j if it doesnt have one yet
                Long current = nums.get(j); //gets how many balls are in container j so far
                nums.put(j, current + container.get(i).get(j)); //adds to the ball count for container j

                size+=container.get(i).get(j); //Increases the size of i container by the number of balls of j type
            }
            sizes.put(i,size);//Assigns the size to the correct container index
        }
        
        System.out.println("Size: " + sizes);
        System.out.println("Nums: "+ nums);
        for (int i = 0; i < sizes.size(); i++) {
            if(!Objects.equals(sizes.get(i), nums.get(i))){
                return "Impossible";
            }
        }
        return "Possible";
    }
}
