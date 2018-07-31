package com.neel.misc2;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums= {0,0,1};
		int j=0;
		for(int i=0;i<nums.length-1;i++){
            if(nums[j]==0){
            	  System.arraycopy(nums,j+1,nums,j,nums.length-j-1);
            	  nums[nums.length-1]=0;
            	  //i--;
            }else {
              j++;
            }
        }
       for(int x:nums) {
    	     System.out.println(x);
       }
	}

}
