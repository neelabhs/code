package com.neel.algo.sorts;

public class InsertionSortInplace {
	static int[] arr = { 12, 5, 9, 3, 6, 2, -2, 10, 7, 4, 8 };
	
	public static void main(String[] args) {
		int tmp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					tmp=arr[i];
					System.arraycopy(arr, j, arr, j+1, i-j);
					arr[j]=tmp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
