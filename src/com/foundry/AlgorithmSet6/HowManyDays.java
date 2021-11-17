package com.foundry.AlgorithmSet6;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;


public class HowManyDays {
    //https://edabit.com/challenge/3hdXjfJozQySRC3gE
    public static int getDays(String date1, String date2) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("LLLL dd, yyyy");
        LocalDate date1Full = LocalDate.parse(date1, dtf);
        LocalDate date2Full = LocalDate.parse(date2, dtf);

        return Math.abs((int) ChronoUnit.DAYS.between(date1Full, date2Full));
    }

    public static int getDateDays(Date date1,Date date2){

        return Math.abs((int)((date2.getTime() - date1.getTime()) / 1000 / 60 / 60 / 24));
    }

    public static int getDaysManual(String date1, String date2){
        int days = 0;
        String[] date1Split = date1.replaceAll(",", "").split(" ");
        String[] date2Split = date2.replaceAll(",", "").split(" ");
        System.out.println(Arrays.toString(date1Split));
        System.out.println(Arrays.toString(date2Split));
        int leap1 = (((((Integer.parseInt(date1Split[2]) / 4) % 4 == 0) && (Integer.parseInt(date1Split[2]) % 100 != 0) || Integer.parseInt(date1Split[2]) % 400 == 0))?28:29);
        int leap2 = (((((Integer.parseInt(date2Split[2]) / 4) % 4 == 0) && (Integer.parseInt(date2Split[2]) % 100 != 0) || Integer.parseInt(date2Split[2]) % 400 == 0))?28:29);

        int leapcount1 = 0;
        int leapcount2 = 0;
        for (int i = 0; i < Integer.parseInt(date1Split[2]); i+=4) {
            if((i % 100 != 0) || (i % 400 == 0)){
                leapcount1 ++;
            }
        }
        for (int i = 0; i < Integer.parseInt(date2Split[2]); i+=4) {
            if((i % 100 != 0) || (i % 400 == 0)){
                leapcount2 ++;
            }
        }

        int days1 = Integer.parseInt(date1Split[1]) + switch (date1Split[0]) {
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
        } + ((Integer.parseInt(date1Split[2])-1) * 365) + leapcount1;

        int days2 = Integer.parseInt(date2Split[1]) + switch (date2Split[0]) {
            case "January" -> 0; //31
            case "February" -> 31; //28 - 29
            case "March"-> (leap2 + 31); //31
            case "April" -> (leap2 + 62); //30
            case "May"-> (leap2 + 92); //31
            case "June" -> (leap2 + 123); //30
            case "July"-> (leap2 + 153); //31
            case "August"-> (leap2 + 184); //31
            case "September" -> (leap2 + 215);//30
            case "October"-> (leap2 +245 );//31
            case "November" -> (leap2 +276);//30
            case "December"-> (leap2 + 306);//31
            default -> throw new IllegalStateException("Unexpected value: " + date2Split[0]);
        } + ((Integer.parseInt(date2Split[2])-1) * 365) + leapcount2;
        days = Math.abs(days1 - days2);
        return days;

        };

    public static void main(String[] args) throws ParseException {
        String inputString1 = "February 28, 2000";
        String inputString2 = "April 28, 2020";
        SimpleDateFormat myFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Date date1 = myFormat.parse(inputString1);
        Date date2 = myFormat.parse(inputString2);
        System.out.println(getDateDays(date1,date2));


//        System.out.println("Days: "+getDays("February 28, 2000","April 28, 2020"));
//        System.out.println("Days: "+getDaysManual("February 28, 2000","April 28, 2020"));
    }
}
