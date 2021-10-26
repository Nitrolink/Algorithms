package com.foundry;

import java.util.Objects;

public class Main {



    public static void main(String[] args) {
	     int vowelsTest1 = HowManyVowels.getCount("Password");
	     System.out.println("Testing Vowel Count");
	     Tester.assertEquals(2, vowelsTest1);



        String reverseIntTest1 = ReversetheNumber.rev(-12345);
        System.out.println("Testing Reverse Int");
        Tester.assertEquals("54321", reverseIntTest1);

        int minuteToSecondTest1 = VideoLength.minutesToSeconds("32:21");
        int minuteToSecondTest2 = VideoLength.minutesToSeconds("1:60");
        System.out.println("Testing Video Length Converter");
        Tester.assertEquals(1941, minuteToSecondTest1);
        Tester.assertEquals(-1, minuteToSecondTest2);
    }


}
