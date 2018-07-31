package com.neel.misc;

public class FibonacciNonRecur {
	
	public static void main(String[] args) {
     	fibonacci(9);
	}
	
	public static void fibonacci(int x) {
		int pre=1;
		int prep=0;
		int curr=0;
		int tmp=0;
		
		if(x==0) {
			return ;
		}
		for(int i=1;i<=x;i++) {
     		curr=pre+prep;
			tmp=pre;
			pre=curr;		
         	prep=tmp;
         	System.out.println(curr);
			
		}
		
		
	}

}
