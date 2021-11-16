package com.foundry.AlgorithmSet1;

import java.util.Objects;

public class HowManyVowels {
    //https://edabit.com/challenge/GBKphScsmDi9ek3ra
    public static int getCount(String str) {
        int vowelsCount = 0;
        // Your code here
        String[] strSplit = str.toLowerCase().split("");
        for(String c : strSplit){
            if(Objects.equals(c, "a") || Objects.equals(c, "e") ||Objects.equals(c, "i") ||Objects.equals(c, "o") || Objects.equals(c, "u")){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
