package com.neel.algo.sorts;

public class SelectionSortRecursive {
	static int[] arr = { 12, 5, 9, 3, 6, 2, -2, 10, 7, 4, 8 };
	
	public static void main(String[] args) {
		selRecur(arr.length);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	public static void selRecur(int n) {
		int tmp;
		if(n==1) {
			return;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
			  tmp=arr[i];
			  arr[i]=arr[i+1];
			  arr[i+1]=tmp;
			}
		}
		selRecur(n-1);
		
	}
	
}
