package com.neel.misc.bitwise;

public class TestBitwise {
	
	
	public static void main(String[] args) {
		int i=5;
		int2bool(5);
	}
	
	
	public static  void int2bool(int x) {
		for(int i=0;i<32;i++) {
			System.out.print(x%(2^i));
		}
	}
	

}
