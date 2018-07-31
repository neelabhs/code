package com.neel.misc;

public class BSTree {
	BSTNode head;
	
	public void inOrder(BSTNode head) {
		if(head==null) {
			return;
		}
		inOrder(head.left);
		System.out.println(head.val);
		inOrder(head.right);		
	}

}
