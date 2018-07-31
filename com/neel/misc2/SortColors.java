package com.neel.misc2;

public class SortColors {

	public static void main(String[] args) {
		int[] arr= {0,2,1};
		sortColors(arr);
		for(int x:arr) {
			System.out.print(x+ " ");
		}
	}
	
    public static void sortColors(int[] nums) {
        int[] cIdx= {0,0,0};
        int i=0;  
        int tmp=0;
        int curr=0;
        while(i<nums.length -1) {
        	 tmp=nums[i+1]; 
        	 curr=nums[i];
        	 if(tmp < curr) {
              int idx=cIdx[tmp];
       		  System.arraycopy(nums, idx, nums, idx+1, (i-idx)+1);
        		  nums[idx]=tmp;
        		  for(int j=tmp;j<3;j++) {
        			  cIdx[j]++;  
        		  }
     	  }else {
     		 for(int j=curr;j<3;j++) {
   			  cIdx[j]++;  
   		  } 
     	  }
        	  
        	  i++;
        }
        
    }

}
