package com.foundry.Advanced.a02_15;

import java.util.ArrayList;
import java.util.Arrays;

public class NodeMaker {
    public static ListNode<Integer> nodeMaker(ArrayList<Integer> arr){
        ListNode<Integer> node = null;
        if(arr.size() > 0){
            node = new ListNode<Integer>(arr.get(0));
            //System.out.println("Added: " + node.value);
            arr.remove(0);
            node.next = nodeMaker(arr);
        }
        return node;
    }
    public static ArrayList<Integer> arrayMaker(ListNode<Integer> input){
        ArrayList<Integer> test = new ArrayList<Integer>();
        while(input != null){
            test.add(input.value);
            input = input.next;
        }
        return test;
    }


}
