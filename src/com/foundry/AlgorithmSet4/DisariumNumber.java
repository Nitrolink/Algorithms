package com.foundry.AlgorithmSet4;

public class DisariumNumber {
    //https://edabit.com/challenge/GjCgCugvh4eorPmgM
    public static boolean isDisarium(int n) {
        int total = 0;
        String[] strSplit = String.valueOf(n).split("");
        for (int i = 0; i < strSplit.length; i++) {
            total += Math.pow(Integer.parseInt(strSplit[i]),(i + 1));
        }
        return total == n;
    }
}
