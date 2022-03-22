package com.foundry.Advanced.HackerRank.a30Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class d10_BinaryNumbers {
    public static void solution(int n){
        //int o = n;
        ArrayList<Integer> binary = new ArrayList<>();
        while (n>0){
            binary.add(n%2);
            n = n/2;
        }
        //System.out.println(o + ": " + binary);
        int totalStreak = 0;
        int currStreak = 0;
        for (int i:binary) {
            if(i == 1){
                currStreak++;
                if(currStreak > totalStreak){
                    totalStreak = currStreak;
                }
            }
            else {
                currStreak = 0;
            }
        }
        //System.out.println("Consec 1s: " + totalStreak);
        System.out.println(totalStreak);
    }

    public static void solution2(int n){
        System.out.println(Collections.max(Arrays.asList(Integer.toBinaryString(n).split("0"))).length());
    }

    public static void main(String[] args) {
        solution2(262141);

    }
}
