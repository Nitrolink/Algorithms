package com.foundry.Advanced.HackerRank.a30Days;

public class d9_Recursion {
    public static int factorial(int n) {
        if(n > 1){
           return (n * factorial(n-1));
        }
        return 1;
    }

}
