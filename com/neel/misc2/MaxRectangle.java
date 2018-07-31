package com.neel.misc2;

public class MaxRectangle {

	public static void main(String[] args) {
		int[] input={2,1,5,6,2,3};
		System.out.println(largestRectangleArea(input));

	}
	
   public static int largestRectangleArea(int[] arr) {
       int max=0;
       int curr=0;
       if(arr==null || arr.length==0) return 0;
       for(int i=0;i<arr.length;i++) {
    	     int left=i-1;
    	     int right=i+1;
    	     int l=1;
    	     while(left>=0 && arr[left]>=arr[i]) {
    	    	   left--;
    	    	   l++;
    	     }
    	     while(right<arr.length && arr[right]>=arr[i]) {
    	    	   right++;
    	    	   l++;
    	     }
    	     curr=l*arr[i];
    	     max=(max<curr)?curr:max;
    	   
       }   
	   return max;
    }

}
