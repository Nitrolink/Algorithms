package com.foundry;

public class MaxAndMin {
    //https://edabit.com/challenge/hymPkXdhmDQLe87QT

    public static int differenceMaxMin(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i: arr) {
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        return max - min;

    }
}
