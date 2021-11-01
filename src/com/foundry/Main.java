package com.foundry;

import java.util.Arrays;

public class Main {

    public static void algorithmSetOne(){
        System.out.println("\n----------------------------------\nFirst Set\n");

        int vowelsTest1 = HowManyVowels.getCount("Password");
        int vowelsTest2 = HowManyVowels.getCount("Arrays");
        Tester.assertEquals("Vowel Count",1,2, vowelsTest1);
        Tester.assertEquals("Vowel Count",2,2, vowelsTest2);

        String reverseIntTest1 = ReversetheNumber.rev(-12345);
        Tester.assertEquals("Reverse Int",1,"54321", reverseIntTest1);

        int minuteToSecondTest1 = VideoLength.minutesToSeconds("32:21");
        int minuteToSecondTest2 = VideoLength.minutesToSeconds("1:60");
        Tester.assertEquals("Video Length Converter",1,1941, minuteToSecondTest1);
        Tester.assertEquals("Video Length Converter",2,-1, minuteToSecondTest2);
    }


    public static void algorithmSetTwo() {
        System.out.println("\n----------------------------------\nSecond Set\n");
        int maxMinTest1 = MaxAndMin.differenceMaxMin(new int[] {6,8,3,21,7,3,9,0,-21,12});
        int maxMinTest2 = MaxAndMin.differenceMaxMin(new int[] {9,8,7,6,5,4,3,2,1,8,6,4,2,8,0,4,10});
        Tester.assertEquals("Max Min",1,42,maxMinTest1);
        Tester.assertEquals("Max Min",2,10,maxMinTest2);


        boolean doubleLetterTest1 = DoubleLetters.doubleLetters("testing");
        boolean doubleLetterTest2 = DoubleLetters.doubleLetters("Spooky");
        boolean doubleLetterTest3 = DoubleLetters.doubleLetters("Oogway");
        boolean doubleLetterTest4 = DoubleLetters.doubleLetters("Boo");
        Tester.assertEquals("Double Letters",1,false,doubleLetterTest1);
        Tester.assertEquals("Double Letters",2,true,doubleLetterTest2);
        Tester.assertEquals("Double Letters",3,true,doubleLetterTest3);
        Tester.assertEquals("Double Letters",4,true,doubleLetterTest4);

        int[] input1 = new int[] {9,8,7,6,5,4,3,2,1,8,6,4,2,8,0,4,10};
        int[] input2 = new int[] {1,2,3,4,5,6,7,8,9};
        int[] sortNumbersTest1 = SortNumbers.sortNumsAscending(input1);
        int[] sortNumbersTest2 = SortNumbers.sortNumsAscending(input2);
        Arrays.sort(input1);
        Arrays.sort(input2);
        Tester.arrayEquals("Sort Numbers",1,input1,sortNumbersTest1);
        Tester.arrayEquals("Sort Numbers",1,input2,sortNumbersTest2);


    }

    public static void algorithmSetThree() {
        int[] algorithmTest1 = ArrayofMultiples.arrayOfMultiples(7,5);
        int[] algorithmTest2 = ArrayofMultiples.arrayOfMultiples(4,0);
        int[] algorithmTest3 = ArrayofMultiples.arrayOfMultiples(0,3);
        int[] algoritmOutput1 = new int[] {7,14,21,28,35};
        int[] algoritmOutput2 = new int[0];
        int[] algoritmOutput3 = new int[] {0,0,0};
        Tester.arrayEquals("Array of Multiples",1,algoritmOutput1,algorithmTest1);
        Tester.arrayEquals("Array of Multiples",2,algoritmOutput2,algorithmTest2);
        Tester.arrayEquals("Array of Multiples",3,algoritmOutput3,algorithmTest3);

        String rpsTest1 = RockPaperScissors.rps("ROCK", "paper");
        String rpsTest2 = RockPaperScissors.rps("Scissors", "SciSsors");
        String rpsTest3 = RockPaperScissors.rps("Paper", "roCk");
        String rpsTest4 = RockPaperScissors.rps("ashduijqagbw", "paper");
        Tester.assertEquals("Rock,Paper,Scissors",1,"Player 2 wins",rpsTest1);
        Tester.assertEquals("Rock,Paper,Scissors",2,"TIE",rpsTest2);
        Tester.assertEquals("Rock,Paper,Scissors",3,"Player 1 wins",rpsTest3);
        Tester.assertEquals("Rock,Paper,Scissors",4,"Incorrect Input",rpsTest4);

    }


    public static void main(String[] args) {
        //algorithmSetOne();
        //algorithmSetTwo();
        algorithmSetThree();
    }


}
