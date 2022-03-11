package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_DataTypes {
    public static void main(String[] args) throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        i += Integer.parseInt(bufferedReader.readLine());
        d += Double.parseDouble(bufferedReader.readLine());
        s += bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
