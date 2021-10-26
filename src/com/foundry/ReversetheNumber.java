package com.foundry;

public class ReversetheNumber {
    //https://edabit.com/challenge/tiyPFonvAJ8e6H9jS
    public static String rev(int n) {
        int absolute = Math.abs(n);
        String[] stringify = String.valueOf(absolute).split("");
        String[] temp = new String[stringify.length];
        int j = 0;
        for(int i = stringify.length; i > 0; i--){
            temp[j] = stringify[i-1];
            j++;
        }
        return String.join("",temp);
    }
}
