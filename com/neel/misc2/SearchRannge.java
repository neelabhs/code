package com.neel.misc2;

public class SearchRannge {

	public static void main(String[] args) {
		int[] arr= {2,2};
		int[] ans=searchRange(arr,3);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}

	public static  int[] searchRange(int[] nums, int target) {
		int[] posArr=new int[2];
		int left=-1;
		int right=-1;
		int pos=getPos(nums,0,nums.length-1,target);
		left=pos;
		right=pos;
		if(pos!=-1) {
			while(left>=0 && nums[left]==target) {
				left--;
			}
			while(right<nums.length && nums[right]==target) {
				right++;
			}
			left++;right--;
		}
		posArr[0]=left;	   
		posArr[1]=right;
		return posArr; 
	}


	public static int getPos(int[] arr,int s,int e,int num) {
		if(s>e) {
			return -1;
		}
		int m=(s+e)/2;
		if(arr[m]==num) {
			return m;
		}else if(num<arr[m]){
			return  getPos(arr,s,m-1,num);
		}else {
			return   getPos(arr,m+1,e,num);
		}

	}

}
