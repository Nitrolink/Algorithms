package com.foundry;


import java.util.Arrays;
import java.util.Objects;

public class Tester {
    public static void assertEquals(String test,int testNum, Object expected,Object result){

        System.out.println(test + " Test "+ testNum + " Starting");
        System.out.println("Expecting: Type-" + expected.getClass().getSimpleName() + " Value:"+ expected);
        System.out.println("Result: Type-" + result.getClass().getSimpleName() + " Value:"+ result);
        if(result.equals(expected)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("----------------------------------");
    }

    public static void arrayEquals(String test,int testNum, int[] expected,int[] result){

        System.out.println(test + " Test "+ testNum + " Starting");
        System.out.println("Expecting: Type-" + expected.getClass().getSimpleName() + " Value:"+ Arrays.toString(expected));
        System.out.println("Result: Type-" + result.getClass().getSimpleName() + " Value:"+ Arrays.toString(result));
        if(Arrays.equals(result, expected)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("----------------------------------");
    }
    public static void objArrayEquals(String test,int testNum, Object[] expected,Object[] result){

        System.out.println(test + " Test "+ testNum + " Starting");
        System.out.println("Expecting: Type-" + expected.getClass().getSimpleName() + " Value:"+ Arrays.toString(expected));
        System.out.println("Result: Type-" + result.getClass().getSimpleName() + " Value:"+ Arrays.toString(result));
        if(Arrays.equals(result, expected)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("----------------------------------");
    }
}
