package com.foundry.Intermediate.AlgorithmSet6;

public class NumberofBoomerangs {
    //https://edabit.com/challenge/b7iHQDw72zzkmgCun
    public static int countBoomerangs(int[] arr) {
        int boomerangCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                boomerangCount++;
            }
        }
        return boomerangCount;
    }
}
