package com.neel.misc;

public class MergeLists {
	
	public static void main(String[] args) {
		Node headA=new Node(2);
		Node headB=new Node(1);
		Node a=new Node(4);
		headA.next=a;
		Node b=new Node(6);
		a.next=b;
		Node c=new Node(3);
		headB.next=c;
		Node d=new Node(5);
		c.next=d;
		
		Node mergdNode=mergeLists(headA,headB);
		while(mergdNode!=null) {
			System.out.print(mergdNode.data);
			mergdNode=mergdNode.next;
		}
		
		
	}
    
	/*
	  Merge two linked lists 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	public static Node mergeLists(Node headA, Node headB) {
	    Node headC=null;
	    Node currC=new Node();
	    
	    while(headA!=null && headB!=null){
	        while(headA.data<headB.data){
	            currC.next=addNewNode(headC,headA.data);
	            currC=currC.next;
	            headA=headA.next;
	        }
	        while(headA.data>headB.data){
	            currC.next=addNewNode(headC,headB.data);
	            currC=currC.next;
	            headB=headB.next;
	        }
	        
	    }
	    if(headA==null){
	        while(headB!=null){
	            currC.next=addNewNode(headC,headB.data);
	            currC=currC.next;
	            headB=headB.next; 
	    
	        }}else{
	            currC.next=addNewNode(headC,headA.data);
	            currC=currC.next;
	            headB=headB.next; 
	    }
	    return headC;
	    }


	    public static Node addNewNode(Node headC,int data){
	        Node c =new Node();
	        c.data=data;
	        c.next=null;
	        if(headC==null){
	            headC=c;
	        }
	        return c;
	    }
	    



	
	
}
