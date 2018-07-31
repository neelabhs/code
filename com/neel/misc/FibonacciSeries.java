package com.neel.misc;

public class FibonacciSeries {
	
	public static void main(String[] args) {
	  System.out.println(fibonacci(9));
	}
	
	public static int fibonacci(int x) {
		if(x==0 || x==1) {
			return 1;
		}
     	return fibonacci(x-1)+fibonacci(x-2);
		
	}

}
