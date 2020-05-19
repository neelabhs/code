package com.neel.misc3;

public class CycleInLL {

    public static void main(String[] args) {
        LLNode h = createLinkedList();
        LLNode newP = h.next;
        boolean isCycle = true;

        while (newP != h) {
            if (newP.next != null && newP.next.next != null) {
                newP = newP.next;
                newP = newP.next;
            } else {
                isCycle = false;
                break;
            }
            h = h.next;
        }
        System.out.print("Is a cycle: " + isCycle);
    }

    public static LLNode createLinkedList() {
        LLNode head = new LLNode(1);
        LLNode n1 = new LLNode(2);
        LLNode n2 = new LLNode(3);
        LLNode n3 = new LLNode(4);
        LLNode n4 = new LLNode(5);
        LLNode n5 = new LLNode(6);
        LLNode n6 = new LLNode(7);
        LLNode n7 = new LLNode(8);
        LLNode n8 = new LLNode(9);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n4;
        return head;

    }
}
