package com.foundry.Advanced.Jan25;

import java.util.Stack;

public class Brackets {
    public static String isBalanced(String s){
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)) {
                case '(', '{', '[' -> myStack.push(s.charAt(i));
            }
            if(myStack.isEmpty()){
                return "NO";
            }
            char c;
            switch (s.charAt(i)) {
                case ')' -> {
                    if (myStack.pop() != '(') {
                        return "NO";
                    }
                }
                case '}' -> {
                    if (myStack.pop() != '{') {
                        return "NO";
                    }
                }
                case ']' -> {
                    if (myStack.pop() != '[') {
                        return "NO";
                    }
                }
            }
        }
        if(myStack.isEmpty()){
            return "YES";
        }
        return "NO";
    }
}