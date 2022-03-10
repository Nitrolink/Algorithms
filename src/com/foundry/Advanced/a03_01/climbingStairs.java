package com.foundry.Advanced.a03_01;

public class climbingStairs {
    int solution(int n) {
        return (n<=2)?n:(solution(n-1)+solution(n-2));
    }
}
