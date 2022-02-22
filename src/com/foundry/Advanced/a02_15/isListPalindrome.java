package com.foundry.Advanced.a02_15;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isListPalindrome {
     boolean solution(ListNode<Integer> l) {
        if(l == null){
            return true;
        }
        List<Long> list = new ArrayList<>();
        while(l != null){
            list.add((long)l.value);
            l = l.next;
        }
        int mid = (int) Math.floor(list.size()/2);
        List<Long> front;
        List<Long> back;
        if(list.size() % 2 == 0){
            front = list.subList(0, mid);
            back =  list.subList(mid, list.size());
        }
        else{
            front = list.subList(0, mid);
            back =  list.subList(mid+1, list.size());
        }
        System.out.println("Front: " + front + ", Back: " + back);
        Collections.reverse(back);
        return front.equals(back);
    }
}
