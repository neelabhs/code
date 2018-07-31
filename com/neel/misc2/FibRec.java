package com.neel.misc2;

public class FibRec {
	
	public static void main(String[] args) {
		int i=fib(5);
		System.out.println(i);
	}
	
	public static int fib(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return fib(n-1)+fib(n-2);
	}

}
