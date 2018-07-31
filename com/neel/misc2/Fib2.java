package com.neel.misc2;

import java.util.HashMap;

public class Fib2 {
	
	public static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		System.out.println(fib(4));
	}

	public static int fib(int x) {
		if(x==1) return 1;
		if(x==2) return 2;
		if(map.containsKey(x)) {
			return map.get(x);
		}else {
			map.put(x, fib(x-1)+fib(x-2));
		}		
		return map.get(x);
	}
	
	
}
