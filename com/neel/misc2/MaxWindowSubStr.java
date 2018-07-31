package com.neel.misc2;

import java.util.HashMap;
import java.util.HashSet;

public class MaxWindowSubStr {

	public static void main(String[] args) {
		//System.out.println(minWindow("ADOBECODEBANC","ABC"));
		System.out.println(minWindow("A","AA"));
	}

	public static String minWindow(String s, String t) {
        char[] str=s.toCharArray();
        char[] ip=t.toCharArray();
        int maxLen=Integer.MAX_VALUE;
        int currLen=0;
        int maxS=-1;
        int maxE=-1;
        
        HashMap<Character,Integer> set=new HashMap<Character,Integer>();
        for(char c:ip) {
        	  set.put(c,0);
        }
        
        for(int i=0;i<str.length;i++) {
        	  if(set.containsKey(str[i])) {
        		  HashMap<Character,Integer> nSet=new HashMap<Character,Integer>(set);
        		  nSet.remove(str[i]);
        		  int j=i;
        		  for(;j<str.length && !nSet.isEmpty();j++) {
        			  if(nSet.containsKey(str[j])) {
        				  nSet.remove(str[j]);
        			  }
        		  }
        		  if(nSet.isEmpty()) {
        			  currLen=j-i;
        			  if(maxLen>currLen) {
        				  maxLen=currLen;
        				  maxS=i;
        				  maxE=j;
        			  }
        		  }
        	  }
        }
        
        String ret="";
        if(maxS==-1 && maxE==-1) {
        	  ret="";
        }else if(maxS==0 && maxE==0){
        	  ret=s.substring(0,1);
        }else {
        	 ret=s.substring(maxS, maxE);
        }
        return ret;
        
    }
	
}
