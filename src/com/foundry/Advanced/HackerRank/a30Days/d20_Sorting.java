package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class d20_Sorting {
    public static int bubSort(List<Integer> a, int n){
        int total = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j+1)) {
                    int temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);
                    numberOfSwaps++;
                    total++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return total;
    }
}
