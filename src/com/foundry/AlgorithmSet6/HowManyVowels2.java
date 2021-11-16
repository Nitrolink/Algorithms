package com.foundry.AlgorithmSet6;

public class HowManyVowels2 {
    //https://edabit.com/challenge/GBKphScsmDi9ek3ra

    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        vowelsCount = str.toUpperCase().replaceAll("[^aeiou]","").length();
        return vowelsCount;
    }
}
