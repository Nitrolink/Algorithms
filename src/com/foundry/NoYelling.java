package com.foundry;

import java.util.Arrays;

public class NoYelling {
    //https://edabit.com/challenge/33tRK98geLPcf73PF
    public static String noYelling(String phrase) {
        String[] strSplit = phrase.split("");
        String end = strSplit[strSplit.length-1] + strSplit[strSplit.length-2];
        String[] copy = new String[strSplit.length-1];
        if(end.equals("!!") || end.equals("??")){
            System.arraycopy(strSplit, 0, copy, 0, copy.length);
            phrase = noYelling(String.join("",copy));
        }

       return phrase;
    }
}
