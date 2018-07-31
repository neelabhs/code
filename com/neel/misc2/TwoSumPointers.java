package com.neel.misc2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPointers {
	
	public static void main(String[] args) {
		int[] arr= {1,5,7,4,12,9,8};
		twoSum(arr,17);  
	}

	
	public static void twoSum(int[] a,int x) {
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==x) {
				System.out.println(a[i]+" "+a[j]);
				i++;
				j--;
			}else if(a[i]+a[j]>x) {
				j--;
			}else {
				i++;
			}
		}
		
	}

}
