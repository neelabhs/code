package com.neel.misc3;


public class CheckBinarySearchTree {

    public static void main(String[] args){

        System.out.print(isBinarySearchTree(createTree()));

    }

    private static boolean isBinarySearchTree(Node root) {
        if(root ==null) return true;
        return (root.val>maxVal(root.left) && root.val<minVal(root.right));
    }

    private static int maxVal(Node n) {
        if(n==null) return Integer.MIN_VALUE;
        return Math.max(Math.max(n.val,maxVal(n.left)),maxVal(n.right));
    }

    private static int minVal(Node n) {
        if(n==null) return Integer.MAX_VALUE;
        return Math.min(Math.min(n.val,minVal(n.left)),minVal(n.right));

    }

    public static Node createTree() {
        Node n1 = new Node(6);
        Node n2 = new Node(4);
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
