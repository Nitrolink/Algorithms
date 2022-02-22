package com.foundry.Advanced.a02_15;


import java.util.ArrayList;
import java.util.Arrays;

public class removeKFromList {
    public static ListNode<Integer> solution(ListNode<Integer> l, int k) {
        if(l == null){
            return l;
        }
        else if(l.value == k){
            if(l.next != null){
                l = solution(l.next, k);
            }
            else {
                return null;
            }
        }
        else{
            if(l.next != null){
                l.next = solution(l.next,k);
            }
        }
        return l;
    }

}
  