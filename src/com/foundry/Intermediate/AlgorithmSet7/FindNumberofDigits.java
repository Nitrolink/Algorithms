package com.foundry.Intermediate.AlgorithmSet7;

public class FindNumberofDigits {
    //https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
    public static int numOfDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int numOfDigitsNoStrings(int num) {
        if (num == 0){
            return 1;
        }
        else{
           return (int) (Math.log10(num) + 1);
        }

    }
}
