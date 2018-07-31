package com.neel.misc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class InorderIterative {

	public static void main(String[] args) {
		Node1 head=createTree();
		List<Integer> list= new ArrayList<Integer>()  ;
		inorderIterative(head,list);
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	
	
	public static void inorderIterative(Node1 root,List<Integer> li) {
	  Stack<Node1> st=new Stack<Node1>();
	  Node1 node=root;
	  st.push(node);
	  while(!st.isEmpty()) {
		  while(node.left!=null) {
			  st.push(node.left);
			  node=node.left;
		  }
		  Node1 n=st.pop();
		  li.add(n.value);
		  if(n.right!=null) {
		    st.push(n.right);
		    
		  }
		  node=st.pop();
	  }
	  
	}
	
	
	public static  void inorder(Node1 node,List<Integer> li){
        if(node == null) return;
        inorder(node.left,li);
        li.add(node.value);
        inorder(node.right,li);
    }
	
    public static Node1  createTree() {
    	   Node1 n1=new Node1(6);
    	   Node1 n2=new Node1(3);
    	   Node1 n3=new Node1(7);
    	   Node1 n4=new Node1(2);
    	   Node1 n5=new Node1(5);
    	   Node1 n6=new Node1(8);
    	   Node1 n7=new Node1(1);
    	   Node1 n8=new Node1(4);
    	   
    	   n1.left=n2;
    	   n1.right=n3;
    	   
    	   n2.left=n4;
    	   n2.right=n5;
    	   
    	   n3.right=n6;
    	   
    	   n4.left=n7;
    	   
    	   n5.left=n8;
    	   return n1;
    }
    
    
    

}


class Node1{
	protected int value;
	protected Node1 left;
	protected Node1 right;
    Node1(int x){
	  value=x;
	}
}