package com.neel.misc3;

import com.sun.javafx.collections.ListListenerHelper;

public class MeringLinkedLists {

    public static void main(String[] args) {
        LLNode head1 = createLinkedList1();
        LLNode head2 = createLinkedList2();
        LLNode mergedList = mergeLists(head1, head2);
    }

    private static LLNode mergeLists(LLNode node1, LLNode node2) {
        LLNode newHead = null;

        if (node1.val < node2.val) {
            newHead = node1;
            node1 = node1.next;
        } else {
            newHead = node2;
            node2 = node2.next;
        }

        LLNode node3 = newHead;
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                LLNode node = new LLNode(node2.val);
                node3.next = node;
                node2 = node2.next;
            } else if (node2 == null) {
                LLNode node = new LLNode(node1.val);
                node3.next = node;
                node1 = node1.next;
            } else if (node1.val > node2.val) {
                LLNode node = new LLNode(node2.val);
                node2 = node2.next;
                node3.next = node;
            } else {
                LLNode node = new LLNode(node1.val);
                node1 = node1.next;
                node3.next = node;
            }
            node3 = node3.next;
        }
        node3.next = null;
        return newHead;
    }

    public static LLNode createLinkedList1() {
        LLNode head = new LLNode(1);
        LLNode n1 = new LLNode(4);
        LLNode n2 = new LLNode(6);
        LLNode n3 = new LLNode(8);
        LLNode n4 = new LLNode(10);
        LLNode n5 = new LLNode(12);
        LLNode n6 = new LLNode(14);
        LLNode n7 = new LLNode(16);
        LLNode n8 = new LLNode(18);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;
        return head;
    }

    public static LLNode createLinkedList2() {
        LLNode head = new LLNode(3);
        LLNode n1 = new LLNode(5);
        LLNode n2 = new LLNode(7);
        LLNode n3 = new LLNode(9);
        LLNode n4 = new LLNode(11);
        LLNode n5 = new LLNode(13);
        LLNode n6 = new LLNode(15);
        LLNode n7 = new LLNode(17);
        LLNode n8 = new LLNode(19);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;
        return head;
    }

}
