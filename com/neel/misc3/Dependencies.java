package com.neel.misc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dependencies {

    static Node[] nodeArr;

    public static void main(String[] args) {
        int[][] arr = {{}, {0}, {0}, {1, 2}, {3}};
        Node head = createGraph(arr);
        printOrder(head);

    }

    private static Node createGraph(int[][] arr) {
        Node head = null;
        nodeArr = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodeArr[i] = new Node(i);
        }
        for (int i = 0; i < arr.length; i++) {
            //nodeArr[i]=new Node(i);
            for (int j = 0; j < arr[i].length; j++) {
                nodeArr[arr[i][j]].depend.add(nodeArr[i]);
            }
            if (arr[i].length == 0) {
                head = nodeArr[i];
            }
        }

        return head;
    }

    static class Node {
        int val;
        List<Node> depend = new ArrayList<>();

        Node(int val) {
            this.val = val;
        }
    }

    static void printOrder(Node n) {
        //System.out.println(n.val);
        List<Node> stack = new ArrayList<>();
        stack.add(n);
        while (!stack.isEmpty()) {
            Node c = stack.remove(0);
            System.out.println(c.val);
            for (Node y : c.depend) {
                stack.add(y);
            }
        }
    }
}
