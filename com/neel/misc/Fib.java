package com.neel.misc;

public class Fib {
  public static void main(String[] args) {
	  fib(5);
  }
  
  public static int fib(int x) {
	  if(x==0) {
		  return 0;
	  }
	  if(x==1) {
		  return 1;
	  }
	  int y= fib(x-1)+fib(x-2);
	  System.out.print(y+" ");
	  return y;
  }
	
}
