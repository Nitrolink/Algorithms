package com.foundry.AlgorithmSet6;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;


public class HowManyDays {
    //https://edabit.com/challenge/3hdXjfJozQySRC3gE
    public static int getDays(String date1, String date2) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("LLLL d, yyyy");
        LocalDate date1Full = LocalDate.parse(date1, dtf);
        LocalDate date2Full = LocalDate.parse(date2, dtf);
        return (int) ChronoUnit.DAYS.between(date1Full, date2Full);
    }

    public static int getDaysManual(String date1, String date2){


        int days = 0;
        String[] date1Split = date1.replaceAll(",", "").split(" ");
        String[] date2Split = date2.replaceAll(",", "").split(" ");
        System.out.println(Arrays.toString(date1Split));
        System.out.println(Arrays.toString(date2Split));
        int leap1 = (((((Integer.parseInt(date1Split[2]) / 4) % 4 == 0) && (Integer.parseInt(date1Split[2]) % 100 != 0) || Integer.parseInt(date1Split[2]) % 400 == 0))?28:29);
        int leap2 = (((((Integer.parseInt(date2Split[2]) / 4) % 4 == 0) && (Integer.parseInt(date2Split[2]) % 100 != 0) || Integer.parseInt(date2Split[2]) % 400 == 0))?28:29);
        
        int days1 = (Integer.parseInt(date1Split[1]) +
                switch (date1Split[0]) {
                    case "January" -> 0;
                    case "February" -> 31;
                    case "March"-> (leap1 + 31);
                    case "April" -> (leap1 + 62);
                    case "May"-> (leap1 + 92);
                    case "June" -> (leap1 + 123);
                    case "July"-> (leap1 + 153);
                    case "August"-> (leap1 + 184);
                    case "September" -> (leap1 + 215);
                    case "October"-> (leap1 + 245);
                    case "November" -> (leap1 + 276);
                    case "December"-> (leap1 + 306);
                    default -> throw new IllegalStateException("Unexpected value: " + date1Split[0]);
                }
                    + (337 + leap1)
        );

        int days2 = (Integer.parseInt(date2Split[1]) +
                switch (date2Split[0]) {
                    case "January" -> 0;
                    case "February" -> 31;
                    case "March"-> (leap2 + 31);
                    case "April" -> (leap2 + 62);
                    case "May"-> (leap2 + 92);
                    case "June" -> (leap2 + 123);
                    case "July"-> (leap2 + 153);
                    case "August"-> (leap2 + 184);
                    case "September" -> (leap2 + 215);
                    case "October"-> (leap2 +245 );
                    case "November" -> (leap2 +276);
                    case "December"-> (leap2 + 306);
                    default -> throw new IllegalStateException("Unexpected value: " + date2Split[0]);
                }
                + (337 + leap2)
        );
        System.out.println(days1);
        System.out.println(days2);


        days = Math.abs(days1 - days2);
        return days;
        };

    public static void main(String[] args) {

        System.out.println("Days: "+getDaysManual("February 28, 2020","March 1, 2020"));
        System.out.println("Days: " + getDays("February 28, 2020","March 1, 2020"));

    }
}
