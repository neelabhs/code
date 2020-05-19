package com.neel.misc3;

public class TreeBalancedCheck {
    public static void main(String[] args){
       // System.out.println("height of tree"+height(createTree()));
                System.out.println("is tree balanced"+ balancedCheck(createTree()));
    }

    private static boolean balancedCheck(Node node) {
        if(node==null) return true;
        return (height(node.left)==height(node.right));
    }

    private static int height(Node n) {
      if(n==null) return 0;
      return 1+(Math.max(height(n.left),height(n.right)));
    }

    public static Node createTree() {
        //Node n1 = new Node(6);
        //Node n2 = new Node(8);
        Node n3 = new Node(1);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(7);
        Node n7 = new Node(5);

       // Node n8=new Node(9);
        //n2.right=n8;

        n7.left = n5;
        n7.right = null;

        n5.left = n3;
        n5.right = n4;

        n6.left = null;
        n6.right = null;

          n3.left = n4.left= null;
          n3.right = n4.right = null;

        return n7;
    }

}
