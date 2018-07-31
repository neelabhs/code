package com.neel.misc2;

public class Kadanes {

	public static void main(String[] args) {
		int[] i= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(i));
	}

	public static int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int glSum=nums[0];
        
        for(int i=1;i<nums.length;i++) {
        	   currSum=Math.max(currSum+nums[i], nums[i]);
        	   glSum=Math.max(currSum, glSum);
        }
        
        return glSum;
    }
	
}
