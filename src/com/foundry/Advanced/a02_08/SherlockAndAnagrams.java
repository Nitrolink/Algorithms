package com.foundry.Advanced.a02_08;

import java.util.*;

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
            //System.out.println(subStrings);
            for (int k = 0; k < subStrings.size(); k++) {
                for (int l = k+1; l < subStrings.size(); l++) {
                    char[] array1 = subStrings.get(k).toCharArray();
                    char[] array2 = subStrings.get(l).toCharArray();
                    //System.out.println(Arrays.toString(array1) + " - " + Arrays.toString(array2));
                    Arrays.sort(array1);
                    Arrays.sort(array2);
                    if(Arrays.equals(array1, array2)) {
                        count++;
                        //System.out.println("Hit");
                    }
                }
            }
        }
        return count;
    }

    //try hashmap frequency mapping of substrings
    public static int frequencyMap(String s) {
        //Make Map
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i + j <= s.length()) {
                    //Add new key for this substring or add to it if already exist (Set value to 0)
                    String str = s.substring(j, i + j);
                    String[] strSplit = str.split("");
                    Arrays.sort(strSplit);
                    str = String.join("",strSplit);
                    //System.out.println("str: " + str);
                    if(map.containsKey(str)){
                        map.put(str,map.get(str) + 1);
                    }
                    else{
                        map.put(str,0);
                    }

                }
            }
        }
        //Loop through keys of map and add total for each key to count and return it
        int count = 0;
        for (String key:map.keySet()) {
            count+=map.get(key);
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "ifailuhkqq";
        System.out.println(frequencyMap(input));
        System.out.println(sherlockAndAnagrams(input));
    }
}
