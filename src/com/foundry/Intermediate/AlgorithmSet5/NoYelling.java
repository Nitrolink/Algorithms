package com.foundry.Intermediate.AlgorithmSet5;

public class NoYelling {
    //https://edabit.com/challenge/33tRK98geLPcf73PF
    public static String noYelling(String phrase){
        while(phrase.endsWith("!!")||phrase.endsWith("??")){
            phrase = phrase.substring(0,phrase.length()-1);
        }
        return phrase;
    }

}
