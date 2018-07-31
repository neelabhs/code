package com.neel.misc2;

public class BracketPerm {
  
	public static void main(String[] args) {
	  perm(5);
    }
     
	
	public static String perm(int n) {
		if(n==0) return "";
		if(n==1) return "()";
		for(int i=0;i<2;i++) {
			if(i==0) { String s1= perm(n-1)+"()";}
			else {String s2= "("+perm(n-1)+")";}
		}
		
		return "";
		
		
	}
  
  
}
