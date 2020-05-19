package com.neel.misc3;

public class CommonAncestor {

    public static void main(String[] args) {
        Node f = commonAncestor(createTree(), 6, 8);
        System.out.print("Node is: "+f.val);
    }

    private static Node commonAncestor(Node n, int a, int b) {
        if (n == null || n.val == a || n.val == b) return null;
        // Node parent=n;
        if (found(n.left, a) && found(n.left, b)) {
            return commonAncestor(n.left, a, b);
        } else if (found(n.right, a) && found(n.right, b)) {
            return commonAncestor(n.right, a, b);
        } else {
            return n;
        }
    }

    private static boolean found(Node n, int a) {
        if (n == null) return false;
        if (n.val == a) return true;
        return found(n.left, a) || found(n.right, a);
    }

    public static Node createTree() {
        Node n1 = new Node(6);
        Node n2 = new Node(8);
        Node n3 = new Node(1);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(7);
        Node n7 = new Node(5);

        n7.left = n5;
        n7.right = n6;

        n5.left = n3;
        n5.right = n4;

        n6.left = n1;
        n6.right = n2;

        n1.left = n2.left = n3.left = n4.left = null;
        n1.right = n2.right = n3.right = n4.right = null;

        return n7;
    }

}


class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}


