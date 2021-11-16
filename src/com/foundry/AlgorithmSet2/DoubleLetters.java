package com.foundry.AlgorithmSet2;

import java.util.Objects;

public class DoubleLetters {
    //https://edabit.com/challenge/EaWY5d2pYBckrkAnS
    public static boolean doubleLetters(String word) {
        String[] strSplit = word.toLowerCase().split("");
        for (int i = 0; i < strSplit.length - 1; i++) {
            if (Objects.equals(strSplit[i], strSplit[i + 1])) {
                return true;
            }
        }
        return false;
    }
}
