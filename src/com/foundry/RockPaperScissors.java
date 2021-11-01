package com.foundry;

public class RockPaperScissors {
    //https://edabit.com/challenge/3S8XppR6Yf5mXPxij

    public static String rps(String s1, String s2) {
        switch (s1.toUpperCase()){
            case "ROCK":
                switch (s2.toUpperCase()){
                    case "ROCK":
                        return "TIE";
                    case "PAPER":
                        return "Player 2 wins";
                    case "SCISSORS":
                        return "Player 1 wins";
                }
            case "PAPER":
                switch (s2.toUpperCase()){
                    case "ROCK":
                        return "Player 1 wins";
                    case "PAPER":
                        return "TIE";
                    case "SCISSORS":
                        return "Player 2 wins";
                }
            case "SCISSORS":
                switch (s2.toUpperCase()){
                    case "ROCK":
                        return "Player 2 wins";
                    case "PAPER":
                        return "Player 1 wins";
                    case "SCISSORS":
                        return "TIE";
                }
        }
        return "Incorrect Input";
    }
}
