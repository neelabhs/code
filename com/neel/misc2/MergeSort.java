package com.neel.misc2;

public class MergeSort {
	
	public static int[] arr= {5,4,3,7,9,1,2,8,6};

	public static void main(String[] args) {
		int len=arr.length;
		merge(0,len-1);
        for(int i:arr) {
        	  System.out.println(i);
        }
  	}
	
	public static void merge(int s,int e) {
		if(s>=e) return;
		int m=(s+e)/2;
		merge(s,m);
		merge(m+1,e);
		mergeArr(s,m,e);
		
	}
	
    public static void  mergeArr(int s,int m,int e) {
    	  int l=s;
    	  int r=m+1;
    	  while(l<=m || r<=e) {
    		  if(arr[l]<arr[r]) {
    			  l++;
    		  }else {
    			int tmp= arr[r];
    			System.arraycopy(arr, l, arr, l+1, r-l);
    			arr[l]=tmp;
    			r++;
    			l++;
    		  }
    	  }
    	  
    }

}
