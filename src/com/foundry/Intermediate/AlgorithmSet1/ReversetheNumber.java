package com.foundry.Intermediate.AlgorithmSet1;

public class ReversetheNumber {
    //https://edabit.com/challenge/tiyPFonvAJ8e6H9jS
    public static String rev(int n) {
        String[] stringify = String.valueOf(Math.abs(n)).split("");
        String[] temp = new String[stringify.length];
        int j = 0;
        for(int i = stringify.length; i > 0; i--){
            temp[j] = stringify[i-1];
            j++;
        }
        return String.join("",temp);
    }
}
