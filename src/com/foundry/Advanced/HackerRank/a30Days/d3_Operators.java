package com.foundry.Advanced.HackerRank.a30Days;

public class d3_Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        System.out.println((int) Math.round((meal_cost + (((double) tip_percent / 100) * meal_cost) + (((double) tax_percent / 100) * meal_cost))));
    }
}
