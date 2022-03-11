package com.foundry.Advanced.HackerRank;

public class Staircase {
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String stair = " ".repeat(n - i) + "#".repeat(i);
            System.out.println(stair);
        }
    }
}
