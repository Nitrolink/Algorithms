package com.foundry.Advanced.HackerRank;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int count = -1;

        for (int i = 0; i < c.size(); i++,count++) {
            if(i+2 < c.size()&&c.get(i+2)==0){
                i++;
            }
        }
        return count;
    }



}
