package com.foundry.Advanced.HackerRank.a30Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d4_ClassVsInstance {
    public static class Person {
        int age;
        public Person(int initialAge) {
            if(initialAge >= 0){
                this.age = initialAge;
            }
            else{
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }
        public void yearPasses(){
            this.age ++;
        }
        public void amIOld(){
            if(this.age < 13){
                System.out.println("You are young.");
            }
            else if (this.age < 18){
                System.out.println("You are a teenager.");
            }
            else{
                System.out.println("You are old.");
            }
        }

    }


    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            Person person = new Person(Integer.parseInt(bufferedReader.readLine()));
            person.amIOld();
            person.yearPasses();
            person.yearPasses();
            person.yearPasses();
            person.amIOld();
            System.out.println("");
        }


        bufferedReader.close();
    }
}
