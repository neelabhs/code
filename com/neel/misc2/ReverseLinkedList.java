package com.neel.misc2;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LLNode head=new LLNode(5);
		//head.next(new LLNode(4).next(new LLNode(9).next(new LLNode(7).next(new LLNode(2)))));
		
		reverse(head);
		
	}
	
	public static LLNode reverse(LLNode node) {
		Stack<LLNode> stack =new Stack<LLNode>();
		while(node!=null) {
			stack.push(node);
			node=node.next;
     	}
		LLNode head=stack.pop();
		LLNode n=head;
		LLNode next=null;
		while(!stack.isEmpty()) {
			next=stack.pop();
			n.next=next;
			n=next;			
		}
		n.next=null;
		return head;
	}
	
}


class LLNode{
	int val;
	LLNode next;
	LLNode(int v){
		this.val=v;
	}
	public void next(LLNode l){
		this.next=l;
	}
}