package com.foundry.AlgorithmSet4;

import java.util.Objects;

public class CaptureTheRook {
    //https://edabit.com/challenge/rYD9NTBmNhaPM6wx2

    public static boolean canCapture(String[] rooks) {
        String[] rook1 = rooks[0].split("");
        String[] rook2 = rooks[1].split("");
        for (int i = 0; i < 2; i++) {
            if(Objects.equals(rook1[i], rook2[i])){
                return true;
            }
        }
        return false;
    }

}
