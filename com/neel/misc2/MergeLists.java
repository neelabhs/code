package com.neel.misc2;

public class MergeLists {

	public static void main(String[] args) {
		int[] arr= {1,4,6,8,9};
		int[] arr2= {2,3,5,7,10,11,13};
		Node h1=createList(arr);
		Node h2=createList(arr2);
		
        Node h3=mergeNode(h1,h2);
        printNode(h3);
	}
	
	
	public static Node  mergeNode(Node h1,Node h2) {
		Node c1=h1;
		Node c2=h2;
		Node res=new Node() ;
		Node resh=res;
		
		
		if(h1==null) {
			if(h2==null) {
				return null;
			}else {
				return h2;
			}
		}else if(h2==null) {
			return h1;
		}else {
			/***/
			 while(c1!=null || c2!=null){
				 if(c1==null) {
					 res.next=c2; 
					 break;
				 }else if(c2==null) {
					 res.next=c1;
					 break;
				 }
				 if(c1.val>c2.val) {
					 res.next=c2;
					 c2=c2.next;
					 res=res.next;
				 }else {
					 res.next=c1;
					 c1=c1.next;
					 res=res.next;
				 }
			 }
		}
		
		return resh.next;
	}
	
	
	public static Node createList(int[] x) {
		if(x==null||x.length<1) return null;
		Node head=new Node();
		Node currNode=head;
		for(int i:x) {
			Node node=new Node();
			node.val=i;
			currNode.next=node;
			currNode=currNode.next;
		}
		currNode.next=null;
		head=head.next;
		return head;
	}
	
	public static void  printNode(Node head) {
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
	
}


class Node{
	int val;
	Node next;
	
	
}