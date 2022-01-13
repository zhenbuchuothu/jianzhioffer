package com.company;

import java.util.ArrayList;

public class 从尾到头打印链表 {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode p = listNode;
        if(p == null){
            return arr;
        }
        while (p != null){
            arr.add(p.val);
            p = p.next;
        }
        int f = 0;
        int e = arr.size()-1;
        int t;
        while(f < e){
            t = arr.get(f);
            arr.set(f,arr.get(e));
            arr.set(e,t);
            f++;
            e--;
        }
        return arr;
    }

}

class ListNode {

    int val;

    ListNode next = null;

    public  ListNode(int val){
        this.val = val;
    }
}
