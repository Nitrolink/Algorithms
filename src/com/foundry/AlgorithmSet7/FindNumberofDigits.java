package com.foundry.AlgorithmSet7;

public class FindNumberofDigits {
    //https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
    public static int numOfDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int numOfDigitsNoStrings(int num) {
        int count = 0;
        if(num == 0){
            count = 1;
        }
        while (num != 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfDigitsNoStrings(0));
    }
}
