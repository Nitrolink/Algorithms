package com.foundry;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n----------------------------------");
	     int vowelsTest1 = HowManyVowels.getCount("Password");
	     Tester.assertEquals("Vowel Count",1,2, vowelsTest1);



        String reverseIntTest1 = ReversetheNumber.rev(-12345);
        Tester.assertEquals("Reverse Int",1,"54321", reverseIntTest1);

        int minuteToSecondTest1 = VideoLength.minutesToSeconds("32:21");
        int minuteToSecondTest2 = VideoLength.minutesToSeconds("1:60");
        Tester.assertEquals("Video Length Converter",1,1941, minuteToSecondTest1);
        Tester.assertEquals("Video Length Converter",2,-1, minuteToSecondTest2);
    }


}
