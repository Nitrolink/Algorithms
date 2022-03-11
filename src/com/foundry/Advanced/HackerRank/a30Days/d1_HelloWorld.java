package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(input);
    }
}
