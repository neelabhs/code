package com.neel.misc3;

public class ReverseLinkedList {

    public static void main(String[] args) {
       printReverse(createLL());
    }

    private static void printReverse(LLNode node) {
        if(node==null) return;
        printReverse(node.next);
        System.out.println(node.val);

    }

    public static LLNode createLL() {
        LLNode head = new LLNode(1);
        LLNode n1 = new LLNode(2);
        LLNode n2 = new LLNode(3);
        head.next = n1;
        n1.next = n2;
        n2.next = null;
        return head;

    }
}

class LLNode {
    int val;
    LLNode next;

    LLNode(int val) {
        this.val = val;
    }
}
