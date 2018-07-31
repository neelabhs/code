package com.neel.misc2;

public class StairsNumOfWays {

	public static void main(String[] args) {
		System.out.println(climbStairs(4));

	}
	
   public static int climbStairs(int n) {
        if(n==0) return 0;
	    if(n==1) return 0;
        if(n==2) return 1;
        
        return climbStairs(n-1)+1+climbStairs(n-2)+1;
    }

}
