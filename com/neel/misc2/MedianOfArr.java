package com.neel.misc2;

public class MedianOfArr {

	public static void main(String[] args) {
		int[] n1= {1,3};
		int[] n2= {2,5};
		double x=findMedianSortedArrays(n1,n2);
		System.out.println(x);

	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	      double res=0;
		  int l1=nums1.length;
	      int l2=nums2.length;
	      int[] arr=new int[l1+l2];
	      int t=l1+l2;
	      int i1=0;
	      int i2=0;
	      if(t==0) return 0;
	      for(int i=0;i<t;i++) {
	    	    if(i1<l1 && i2<l2) {
	    	    	  if(nums1[i1]<nums2[i2]) {
	    	    		  arr[i]=nums1[i1++];
	    	    		  
	    	    	  }else {
	    	    		  arr[i]=nums2[i2++]; 
	    	    		  
	    	    	  }
	    	    }else if(i1<l1) {
	    	    	 arr[i]=nums1[i1++];
	    	    }else {
	    	    	arr[i]=nums2[i2++];
	    	    }
	      }
	        if(t%2==0) {
	        	  res=(double)(arr[t/2]+arr[t/2-1])/2;
	        }else {
	        	  res=arr[(t-1)/2];
	        }
	        return res;
	    }

}
