package com.neel.misc.randomLinkedList;

import java.util.HashMap;

public class RandomNodeImpl {
	
	public static void main(String[] args) {
		RandomNode head= createRandomList();
		print(head);
		
		RandomNode newHead=deepCopy(head);
		print(newHead);
	}
	
	public static RandomNode deepCopy(RandomNode head) { 
		RandomNode n=head;
		RandomNode curr=new RandomNode(0);
		RandomNode nHead=curr;
		HashMap<RandomNode,Integer> h=new HashMap<RandomNode,Integer>();
		HashMap<Integer,RandomNode> h2=new HashMap<Integer,RandomNode>();
		int i=0;
		int j=0;
		while(head!=null) {
			curr.next=new RandomNode(head.value);
			h.put(head,i++);
			head=head.next;
			curr=curr.next;
			h2.put(j++,curr);
		}
     	curr.next=null;
		nHead=nHead.next;
		
		RandomNode curr2=nHead;
		while(n!=null) {
			curr2.random=h2.get(h.get(n.random));
			n=n.next;
			curr2=curr2.next;
		}

		return nHead;
	}
	
	
	
	
	

	public static RandomNode createRandomList() {
		RandomNode node1=new RandomNode(1);
		RandomNode node2=new RandomNode(2);		
		RandomNode node3=new RandomNode(3);
		RandomNode node4=new RandomNode(4);
		RandomNode node5=new RandomNode(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=null;
		node1.random=node3;
		node2.random=node4;
		node3.random=node1;
		node4.random=node4;
		node5.random=node4;
		
		return node1;
	}
	
	public static void print(RandomNode head) {
		while(head!=null) {
			System.out.println("value:"+head.value+" random val:"+head.random.value);
			head=head.next;
		}
	}
	
	
}
