package com.foundry;

import com.foundry.Intermediate.AlgorithmSet1.*;
import com.foundry.Intermediate.AlgorithmSet2.*;
import com.foundry.Intermediate.AlgorithmSet3.*;
import com.foundry.Intermediate.AlgorithmSet4.*;
import com.foundry.Intermediate.AlgorithmSet5.*;
import com.foundry.Intermediate.HotSeat;

import java.util.Arrays;

public class Main {

    public static void hotseatTestA(){
        System.out.println("\n----------------------------------\nHotseat Test\n");
        int[] input1 = new int[] {1, 2, 10, 50, 5};
        int[] input2 = new int[] {80, 29, 4, -95, -24, 85};
        int[] input3 = new int[] {};
        int[] input4 = null;

        int[] sortNumbersTest1 = HotSeat.sortNumsAscending(input1);
        int[] sortNumbersTest2 = HotSeat.sortNumsAscending(input2);
        int[] sortNumbersTest3 = HotSeat.sortNumsAscending(input3);
        int[] sortNumbersTest4 = HotSeat.sortNumsAscending(input4);

        Arrays.sort(input1);
        Arrays.sort(input2);

        Tester.arrayEquals("Sort Numbers",1,input1,sortNumbersTest1);
        Tester.arrayEquals("Sort Numbers",2,input2,sortNumbersTest2);
        Tester.arrayEquals("Sort Numbers",3,new int[0],sortNumbersTest3);
        Tester.arrayEquals("Sort Numbers",4,new int[0],sortNumbersTest4);
    }

    public static void algorithmSetOneA(){
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

    public static void algorithmSetTwoA() {
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

    public static void algorithmSetThreeA() {
        System.out.println("\n----------------------------------\nThird Set\n");
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

    public static void algorithmSetFourA(){
        System.out.println("\n----------------------------------\nFourth Set\n");
        boolean capRookTest1 = CaptureTheRook.canCapture(new String[]{"A8","A2"});
        boolean capRookTest2 = CaptureTheRook.canCapture(new String[]{"B5","C7"});
        boolean capRookTest3 = CaptureTheRook.canCapture(new String[]{"C3","B3"});
        Tester.assertEquals("Capture the Rook", 1,true,capRookTest1);
        Tester.assertEquals("Capture the Rook", 2,false,capRookTest2);
        Tester.assertEquals("Capture the Rook", 3,true,capRookTest3);

        boolean disariumNumTest1 = DisariumNumber.isDisarium(75);
        boolean disariumNumTest2 = DisariumNumber.isDisarium(135);
        boolean disariumNumTest3 = DisariumNumber.isDisarium(518);
        boolean disariumNumTest4 = DisariumNumber.isDisarium(466);
        Tester.assertEquals("Disarium Number", 1,false,disariumNumTest1);
        Tester.assertEquals("Disarium Number", 2,true,disariumNumTest2);
        Tester.assertEquals("Disarium Number", 3,true,disariumNumTest3);
        Tester.assertEquals("Disarium Number", 4,false,disariumNumTest4);

        int largestGap1 = LargestGap.largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}); //11
        int largestGap2 = LargestGap.largestGap(new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}); //4
        int largestGap3 = LargestGap.largestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}); //2
        Tester.assertEquals("Largest Gap",1,11,largestGap1);
        Tester.assertEquals("Largest Gap",2,4,largestGap2);
        Tester.assertEquals("Largest Gap",3,2,largestGap3);

    }

    public static void algorithmSetFiveA(){
        System.out.println("\n----------------------------------\nFifth Set\n");
        int highestDigitTest1 = HighestDigit.highestDigit(4666);
        int highestDigitTest2 = HighestDigit.highestDigit(544);
        int highestDigitTest3 = HighestDigit.highestDigit(379);
        int highestDigitTest4 = HighestDigit.highestDigit(2);
        int highestDigitTest5 = HighestDigit.highestDigit(377401);
        Tester.assertEquals("Highest Digit", 1,6,highestDigitTest1);
        Tester.assertEquals("Highest Digit", 2,5,highestDigitTest2);
        Tester.assertEquals("Highest Digit", 3,9,highestDigitTest3);
        Tester.assertEquals("Highest Digit", 4,2,highestDigitTest4);
        Tester.assertEquals("Highest Digit", 5,7,highestDigitTest5);

        String noYellingTest1 = NoYelling.noYelling("What went wrong?????????");
        String noYellingTest2 = NoYelling.noYelling("Oh my goodness!!!");
        String noYellingTest3 = NoYelling.noYelling("I just!!! can!!! not!!! believe!!! it!!!");
        String noYellingTest4 = NoYelling.noYelling("Oh my goodness!");
        String noYellingTest5 = NoYelling.noYelling("I just cannot believe it.");

        Tester.assertEquals("No Yelling", 1,"What went wrong?",noYellingTest1);
        Tester.assertEquals("No Yelling", 2,"Oh my goodness!",noYellingTest2);
        Tester.assertEquals("No Yelling", 3,"I just!!! can!!! not!!! believe!!! it!",noYellingTest3);
        Tester.assertEquals("No Yelling", 4,"Oh my goodness!",noYellingTest4);
        Tester.assertEquals("No Yelling", 5,"I just cannot believe it.",noYellingTest5);
    }

    public static void algorithmSetSixA(){



    }

    public static void main(String[] args) {
        //hotseatTestA();
        //algorithmSetOneA();
        //algorithmSetTwoA();
        //algorithmSetThreeA();
        //algorithmSetFourA();
        //algorithmSetFiveA();



    }


}
