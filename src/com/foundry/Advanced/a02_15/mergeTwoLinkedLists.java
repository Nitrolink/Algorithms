package com.foundry.Advanced.a02_15;

import java.util.*;

public class mergeTwoLinkedLists {
    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(l1 != null){
            list.add(l1.value);
            l1 = l1.next;
        }
        while(l2!= null){
            list.add(l2.value);
            l2 = l2.next;
        }
        Collections.sort(list);
        return listAdd(list);
    }

    ListNode<Integer> listAdd(ArrayList<Integer> list){

        ListNode<Integer> last = new ListNode<>(list.get(0));
        list.remove(0);
        if(list.isEmpty()) {
            return last;
        }
        last.next = listAdd(list);
        return last;
    }

}
