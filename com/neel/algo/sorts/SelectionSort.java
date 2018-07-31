package com.neel.algo.sorts;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr= {12,5,9,3,6,2,-2,10,7,4,8};
		int len=arr.length;
		int tmp;
		
		for(int i=1;i<len;i++) {
			for(int j=0;j<len-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
	}

}
