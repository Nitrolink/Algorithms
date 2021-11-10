package com.foundry;

public class HighestDigit {
    //https://edabit.com/challenge/9X8zLpBEcQsyerPgL

    public static int highestDigit(int n) {

        int highest = 0;
        String[] strSplit = String.valueOf(n).split("");
        for (String s : strSplit) {
            if(Integer.parseInt(s) > highest){
                highest = Integer.parseInt(s);
            }
        }
        return highest;
    }

}
