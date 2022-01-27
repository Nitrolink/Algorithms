package com.foundry.Advanced;

import java.util.Stack;

public class brackets {
    public static String isBalanced(String s){

        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' ||s.charAt(i) == '('){
                myStack.push(s.charAt(i));
            }
            if(myStack.isEmpty()){
                return "NO";
            }
            char c;
            switch (s.charAt(i)) {
                case ')' -> {
                    c = myStack.pop();
                    if (c == '{' || c == '[') {
                        return "NO";
                    }
                }
                case '}' -> {
                    c = myStack.pop();
                    if (c == '(' || c == '[') {
                        return "NO";
                    }
                }
                case ']' -> {
                    c = myStack.pop();
                    if (c == '{' || c == '(') {
                        return "NO";
                    }
                }
            }

        }
        if(myStack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("}"));
        System.out.println(isBalanced("{"));




    }
}
