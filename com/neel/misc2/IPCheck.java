package com.neel.misc2;

import java.util.Scanner;

public class IPCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] sarr=new String[n];
		for(int i=0;i<n;i++) {
		 sarr[i]=sc.next();
		}
		for(int j=0;j<n;j++) {
		 System.out.println(checkIP(sarr[j]));
		}
	}
	
	public static String checkIP(String s) {
		String ret;
		boolean isV4=false;
		boolean isV6=false;
		int l=s.length();
		
		if(l>=7 && l<=15 && s.indexOf(".")>0 && checkIpv4(s)) {
			isV4=true;
		}else if(l>=15 && l<=39 && s.indexOf(":")>0 && checkIpv6(s)){
			isV6=true;
		}
	    
		if(isV4) {
	    	  ret="IPv4";
	    }else if(isV6) {
	    	  ret="IPv6";
	    }else {
	    	  ret="Neither";
	    }
	    return ret;
	}
	
	public static boolean checkIpv4(String s) {
		boolean isV4=true;
		try {
		  String[] sarr=	s.split("\\.");
		  if(sarr.length!=4) return false;
		  for(String str:sarr) {
			  if(!isValidV4Quad(str)) {
				  return false;
			  }
		  }
		
		}catch(Exception e) {
			isV4=false;
		}
		
		return isV4;
	}
	
   
	
	
	public static boolean checkIpv6(String s) {
		boolean isV6=true;
		try {
		  String[] sarr=	s.split(":");
		  if(sarr.length!=8) return false;
		  for(String str:sarr) {
			  if(!isValidV6Oct(str)) {
				  return false;
			  }
		  }
		
		}catch(Exception e) {
			isV6=false;
		}
		
		return isV6;
	}
	
	
	public static  boolean isValidV4Quad(String str) {
		boolean isV4=false;
		try {
			if(Integer.parseInt(str)<256) {
				isV4=true;
			}
			
		}catch(NumberFormatException e) {
			isV4=false;
		}
		
		
		return isV4;
	}
	
	public static  boolean isValidV6Oct(String str) {
		boolean isV6Quad=false;
		int len=str.length();
		if(len<=4){
			char[] carr=str.toCharArray();
			for(char c:carr) {
				isV6Quad=isValid(c);
			}
		}
		return isV6Quad;
	}
	
	public static boolean isValid(char c) {
		   boolean isValid6Char=false;
		   int val=Character.getNumericValue(c);
		   if( val>=0 && val<=15) {
			   isValid6Char= true;
		   }
		   return isValid6Char;
	}
	
	
	

}
