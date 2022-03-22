package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class d6_LetsReview {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int j = 0; j < n; j++) {
            String s = bufferedReader.readLine();
            StringBuilder evens = new StringBuilder();
            StringBuilder odds = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if(i%2 == 0 ){
                    evens.append(s.charAt(i));
                }
                else{
                    odds.append(s.charAt(i));
                }
            }
            System.out.println(evens + " " + odds);
        }



        bufferedReader.close();
    }
}
