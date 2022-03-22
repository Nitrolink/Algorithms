package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d12_Inheritance {
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    static class Student extends Person{
        private final int[] testScores;

        Student(String firstName, String lastName, int id,int[] scores) {
            super(firstName, lastName, id);
            this.testScores = scores;
        }


        public Character calculate(){
            int totalscore = 0;

            for (int score:this.testScores) {
                totalscore += score;
            }
            int avg = totalscore / this.testScores.length;

            if(avg >=90){
                return 'O';
            }
            if (avg>=80){
                return 'E';
            }
            if(avg >= 70){
                return 'A';
            }
            if(avg >= 55){
                return 'P';
            }
            if(avg >= 40){
                return 'D';
            }
            return 'T';
        }
        // Write your method here
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] studentInfo = bufferedReader.readLine().split(" ");
        int[] scores = new int[Integer.parseInt(bufferedReader.readLine())];
        String[] scoreStrings = bufferedReader.readLine().split(" ");
        for (int i = 0; i < scoreStrings.length; i++) {
            scores[i] = Integer.parseInt(scoreStrings[i]);
        }
        Student student = new Student(studentInfo[0],studentInfo[1],Integer.parseInt(studentInfo[2]),scores);

        System.out.println("Name: " + student.lastName + ", " + student.firstName);
        System.out.println("ID: " + student.idNumber);
        System.out.println("Grade: "+ student.calculate());

        bufferedReader.close();
    }
}
