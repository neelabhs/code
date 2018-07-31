package com.neel.misc2;



public class SearchRotatedArray {
	public static void main(String[] args) {	
		
		int[] arr= {3,1};
	
		System.out.println(search(arr,1));
	}

	
	public static int search(int[] arr,int x) {
		  
		return binSearch(0,arr.length-1,x,arr);
	}
	
	
	public static int binSearch(int s,int e,int n,int[] a) {
		
		int m=(s+e)/2;
        if(a[m]==n) return m;
		if(s>=e) return -1;
        if(a[s]==n)return s;
        if(a[e]==n)return e;
        
		if(a[s]<a[m]) {
			if(n>=a[s] && n<a[m]) {
				e=m-1;
			}else {	
				s=m+1;
			}
		}else {
			if(n>a[m] && n<=a[e]) {
				s=m+1;
			}else {
				e=m-1;
			}
		}
		
		return binSearch(s,e,n,a);
	}
}
