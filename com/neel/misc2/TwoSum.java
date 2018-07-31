package com.neel.misc2;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr= {1,5,7,4,12,9,8};
		twoSum(arr,17);  
	}

	
	public static void twoSum(int[] arr,int x) {
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i:arr) {
			if(hash.containsKey(x-i)) {
			  System.out.println(i+" "+(x-i));
			}
			hash.put(i, i);
		}
		
	}
	
	
}
