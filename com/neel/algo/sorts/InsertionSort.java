package com.neel.algo.sorts;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr= {12,5,9,3,6,2,-2,10,7,4,8};
		int len=arr.length;
		int[] newArr=new int[len+1];
		newArr[0]=Integer.MAX_VALUE;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[i]>newArr[j]) {
					continue;
				}else {
					System.arraycopy(newArr, j, newArr, j+1, i+1-j);
					newArr[j]=arr[i];
					break;
				}
				
			}
		}
		for(int n:newArr) {
			System.out.print(n+" ");
		}
		
	}

}
