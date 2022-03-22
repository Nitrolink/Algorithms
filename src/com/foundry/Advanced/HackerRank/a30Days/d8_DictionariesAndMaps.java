package com.foundry.Advanced.HackerRank.a30Days;

import java.io.*;
import java.util.*;


public class d8_DictionariesAndMaps {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        HashMap<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            phoneBook.put(input[0],Integer.parseInt(input[1]));
        }

        String input;
        while((input = bufferedReader.readLine()) !=null) {
            if(phoneBook.containsKey(input)){
                System.out.println(input + "=" + phoneBook.get(input));
            }
            else{
                System.out.println("Not found");
            }
        }
        bufferedReader.close();
    }
}
