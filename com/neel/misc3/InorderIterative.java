package com.neel.misc3;

import java.util.ArrayList;
import java.util.List;

public class InorderIterative {

    public static void main (String[] args){

        Node root=createTree();

        List<Node> list=new ArrayList<>();
        list.add(root);
        while(!list.isEmpty()){
            Node x=list.remove(list.size()-1);
            Node l=x.left;
            Node r=x.right;
            if(r!=null){
                list.add(r);
            }
            if(l!=null){
                list.add(x);
                list.add(l);
            }else{
                System.out.println(x.val);
                if(!list.isEmpty())
                System.out.println(list.remove(list.size()-1).val);
            }
        }



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
