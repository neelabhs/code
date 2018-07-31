package com.neel.misc2;

public class ValidBST {

	public static void main(String[] args) {
		Node2 root=createTree();
        System.out.println(isValidBST(root));
	}
	
	public static boolean isValidBST(Node2 node) {		
		if(node==null) return true;	
		//return ((node.left==null || node.value>node.left.value) && (node.right==null || node.value<node.right.value) 
		//		&& isValidBST(node.left) && isValidBST(node.right) && node.value>max(node.left) && node.value<min(node.right) );
		return (node.value>=max(node.left) && node.value<=min(node.right) && isValidBST(node.left) && isValidBST(node.right)  );
	}
	
	public static int max(Node2 node) {
	    if(node==null) return Integer.MIN_VALUE;
		Node2 prev=node;
		while(node!=null) {
	    	  prev=node;
	    	  node=node.right;
	    }
	    return prev.value;
	}
	
	public static int min(Node2 node) {
		if(node==null) return Integer.MAX_VALUE;
		Node2 prev=node;
		while(node!=null) {
	    	  prev=node;
	    	  node=node.left;
	    }
	    return prev.value;
	}
	
	
	public static Node2  createTree() {
 	   Node2 n1=new Node2(2147483646);
 	   /*Node2 n2=new Node2(9);
 	   Node2 n3=new Node2(7);
 	   Node2 n4=new Node2(2);
 	   Node2 n5=new Node2(5);
 	   Node2 n6=new Node2(8);
 	   Node2 n7=new Node2(1);
 	   Node2 n8=new Node2(4);
 	   Node2 n9=new Node2(6);
 	   
 	   n1.left=n2;
 	   n1.right=n3;
 	   
 	   n2.left=n4;
 	   n2.right=n5;
 	   
 	   n3.right=n6;
 	   n3.left=n9;
 	   
 	   n4.left=n7;
 	   
 	   n5.left=n8;*/
 	   return n1;
 }

}


class Node2{
	protected int value;
	protected Node2 left;
	protected Node2 right;
    Node2(int x){
	  value=x;
	}
}