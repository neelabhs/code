package com.neel.misc;

public class Array2BST {
	
	static int[] arr= {1,2,3,4,5,6,7};
	
	public static void main(String[] args) {
		
		
		BSTNode root=createTree(0,arr.length-1);
		inOrder(root);
		
		
	}
	
	public static BSTNode createTree(int s,int e) {
		if(s>e) {
			return null;
		}
		if(s==e) {
			return new BSTNode(arr[s]);
		}
		 
		int m=(e+s)/2;
		BSTNode mid=new BSTNode(arr[m]);
		mid.left=createTree(s,m-1);
		mid.right=createTree(m+1, e);
		return mid;		
		
	}
	
	
	public static void inOrder(BSTNode n) {
		if(n==null) {return;}
		inOrder(n.left);
		System.out.println(n.val);
		inOrder(n.right);
		
	}
	
	
	

}
