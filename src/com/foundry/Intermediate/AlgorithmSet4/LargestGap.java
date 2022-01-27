package com.foundry.Intermediate.AlgorithmSet4;

import java.util.Arrays;

public class LargestGap {
    //https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
    public static int largestGap(int[] numbers) {
        int diff = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if((numbers[i + 1] - numbers[i]) > diff){
                diff = (numbers[i + 1] - numbers[i]);
            }
        }
        return diff;
    }
}
