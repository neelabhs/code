package com.neel.misc2;

public class CountOfBits {
	
  public static void main(String[] args) {
	 System.out.println(hammingWeight(11));
  }
  
  public static int hammingWeight(int n) {
      int count=0;
	  while(n!=0) {
		  if(n%2==1) {
			  count++;
		  }
		  n=n>>1;  
	  }
      
      return count;
      
  }
  
  public static boolean getBitAtIndex(int n,int idx){
	  int mask=1;
	  for(int i=0;i<idx;i++) {
		  mask=mask<<1;
	  }	  
	  return (n&mask)>0;
  }
  
}
