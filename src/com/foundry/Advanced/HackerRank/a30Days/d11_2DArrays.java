package com.foundry.Advanced.HackerRank.a30Days;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class d11_2DArrays {
    public static void solution(List<List<Integer>> arr){
        int max = -100;

        for (int r = 0; r < 4; r++) {
            for (int c = 1; c < 5; c++) {
                int top3 = arr.get(r).get(c-1) + arr.get(r).get(c) + arr.get(r).get(c+1);
                int mid1 = arr.get(r+1).get(c);
                int bot3 = arr.get(r+2).get(c-1) + arr.get(r+2).get(c) + arr.get(r+2).get(c+1);
                int total = top3 + mid1 + bot3;
                if(total > max){
                    max = total;
                }
            }
        }

        System.out.println(max);
    }
}
