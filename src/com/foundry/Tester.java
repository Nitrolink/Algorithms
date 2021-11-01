package com.foundry;


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


}
