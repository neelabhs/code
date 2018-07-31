package com.neel.misc2;

public class StrComb {
  public static void main(String[] args) {
	String s="abcd";
	comb(s);
  }
  
  public static String comb(String s) {
	  System.out.println(s);
	  if(s.length()==0) return "";
	  if(s.length()==1) return s;
	 
	  return s.charAt(0)+comb(s.substring(1, s.length()));
	  
 }
  
}
