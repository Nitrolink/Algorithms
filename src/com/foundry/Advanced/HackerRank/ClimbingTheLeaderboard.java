package com.foundry.Advanced.HackerRank;

import java.util.*;

public class ClimbingTheLeaderboard {

/*
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> placements = new ArrayList<>();
        List<Integer> leaderboard = new ArrayList<>(new HashSet<>(ranked));
        Collections.sort(leaderboard);
        Collections.reverse(leaderboard);

        for (int score: player) {
            boolean assigned = false;
            for (int i = 1; i <= leaderboard.size(); i++) {
                if(score >= leaderboard.get(i-1)){
                    placements.add(i);
                    assigned = true;
                    break;
                }
            }
            if(!assigned){
                placements.add(leaderboard.size()+1);
            }
        }
        return placements;
    }
*/
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> placements = new ArrayList<>();
        List<Integer> leaderboard = new ArrayList<>(new HashSet<>(ranked));
        Collections.sort(leaderboard);
        int i = 0;
        for (int score: player) {
            while (i < leaderboard.size() && leaderboard.get(i)<=score){
                i++;
            }
            placements.add(leaderboard.size()-i + 1);
        }
        return placements;
    }

}
