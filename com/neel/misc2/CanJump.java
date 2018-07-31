package com.neel.misc2;

public class CanJump {

	public static void main(String[] args) {
		int[] arr= {2,0,0};
        System.out.println(canJump(arr,0));
	}
	
	public static boolean canJump(int[] nums,int i) {
		if(i==nums.length-1) {
			return true;
		}else if(i>=nums.length) {
			return false;
		}else {
			for(int j=1;j<=nums[i];j++) {
				if(canJump(nums, j+i)) return true;
			}
			return false;
		}
		
	}

}
