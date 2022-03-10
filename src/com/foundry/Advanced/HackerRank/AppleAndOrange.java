package com.foundry.Advanced.HackerRank;

import java.util.List;

public class AppleAndOrange {
    // a=Apple Tree
    // s=Start of House
    // t=End of House
    // b=Orange Tree


    // d is more than s-a and less than t-a
    // d is less than t-b and more than s-b


    // a+d is more than s and less than t
    // b+d is more than s and less than t

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int aCount = 0;
        int oCount = 0;

        for (int apple:apples) {
            int drop = a+apple;
            if(drop >= s && drop <= t){
                aCount++;
            }
        }
        for (int orange:oranges) {
            int drop = b+orange;
            if(drop >= s && drop <= t){
                oCount++;
            }
        }
        System.out.println(aCount);
        System.out.println(oCount);

    }



}
