package com.neel.misc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr= {1,5,7,4,12,9,8};
		threeSumX(arr,17); 
		//threeSum(arr,17);
		HashSet<String> hs=new HashSet<String>();
		String key=Integer.toString(1);
	}
	
	public static void threeSumX(int[] a,int x) {		
		Arrays.sort(a);
		//ArrayList<ArrayList<Integer>> tl=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.length-2 && a[i]<x ;i++) {
			int j=i+1;
			int k=a.length-1;
			while(j<k) {
				if(a[k]+a[j]==x-a[i]) {
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					j++;
					k--;
				}else if(a[k]+a[j]>x-a[i]){
					k--;
				}else {
					j++;
				}
			}
		}
		
		
	}

	
	
	public static void threeSum(int[] a,int x) {
		Arrays.sort(a);
		ArrayList<ArrayList<Integer>> tl=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.length && a[i]<x ;i++) {
			tl=twoSum(a,i,x-a[i]);
			if( tl.size()>0) {	
				for(ArrayList<Integer> al:tl) {
					System.out.print(a[i]+ " ");
					for(int y:al) {
						System.out.print(a[y] +" ");						
					}
					System.out.print("\n");
				}				
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> twoSum(int[] a,int n,int x) {		
		int i=0;
		int j=a.length-1;
		ArrayList<ArrayList<Integer>> fl=new ArrayList<ArrayList<Integer>>();		
		while(i<j) {
			if(i==n) {
				i++;
			}else if(j==n) {
				j--;
			}
			if(i<j) {
				if(a[i]+a[j]==x) {
					ArrayList<Integer> al=new ArrayList<Integer>();
					al.add(i);
					al.add(j);
					fl.add(al);
					i++;
					j--;
				}else if(a[i]+a[j]>x) {
					j--;
				}else {
					i++;
				}
			}
		}
		return fl;
	}

}
