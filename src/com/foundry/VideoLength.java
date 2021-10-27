package com.foundry;

public class VideoLength {
    //https://edabit.com/challenge/9D39q2q9yAFCDM9da

    public static int minutesToSeconds(String tm) {
        String[] strSplit = tm.split(":");
        if(Integer.parseInt(strSplit[1]) >= 60){
            return -1;
        }
        else{
            int totalSeconds = 0;
            totalSeconds += Integer.parseInt(strSplit[0]) * 60;
            totalSeconds += Integer.parseInt(strSplit[1]);
            return totalSeconds;
        }
    }
}
