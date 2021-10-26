package com.foundry;

public class Tester {
    public static void assertEquals(Object expected,Object result){
        System.out.println("Expecting: " + expected.getClass().getSimpleName() + " "+ expected);
        System.out.println("Result: " + result.getClass().getSimpleName() + " "+ result);
        if(result.equals(expected)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("----------------------------------");
    }
}
