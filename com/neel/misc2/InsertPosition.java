package com.neel.misc2;

public class InsertPosition {

	public static void main(String[] args) {
		int[] arr= {1};
		System.out.println(searchInsert(arr,1));
	}

	
    public static int searchInsert(int[] nums, int target) {
      if(nums==null || nums.length<1) return 0;
    	  return binSearch(nums,0,nums.length-1,target);   
    }
    
    public static int binSearch(int[] arr,int s,int e,int num) {
    	  if(s>e) {
    		  return s;
    	  }
    	  int m=(s+e)/2;
    	  if(arr[m]==num) {
    		  return m;
    	  }else if(arr[m]>num) {
    		  return binSearch(arr,s,m-1,num);  
    	  }else {
    		  return binSearch(arr,m+1,e,num);
    	  }
    	  
    }
    
	
}
