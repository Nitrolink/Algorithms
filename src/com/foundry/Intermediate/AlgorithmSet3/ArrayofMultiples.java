package com.foundry.Intermediate.AlgorithmSet3;

public class ArrayofMultiples {
    //https://edabit.com/challenge/rzpucPyoyEtXPo2BG

    public static int[] arrayOfMultiples(int num, int length) {
        int[] endArray = new int[length];

        for (int i = 0; i < length; i++) {
            endArray[i] = num * (i+1);
        }

        return endArray;
    }
}
