package com.foundry.Advanced.a02_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SherlockAndAnagrams {
    public static int sherlockAndAnagrams(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            List<String> subStrings = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                if(i+j <= s.length()){
                    subStrings.add(s.substring(j, i+j));
                }
            }
            System.out.println(subStrings);
            for (int k = 0; k < subStrings.size(); k++) {
                for (int l = k+1; l < subStrings.size(); l++) {
                    char[] array1 = subStrings.get(k).toCharArray();
                    char[] array2 = subStrings.get(l).toCharArray();
                    Arrays.sort(array1);
                    Arrays.sort(array2);
                    if(Arrays.equals(array1, array2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "ifailuhkqq";
        System.out.println(sherlockAndAnagrams(input));
    }
}
