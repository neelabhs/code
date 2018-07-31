package com.neel.misc2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenParantheses {

	public static void main(String[] args) {
		
		List<String> f=generateParenthesis(3);
		for(String s:f) {
			System.out.println(s);
		}
	}
	
   public static List<String> generateParenthesis(int n) {
        if(n==1) {
        	List<String> l= new ArrayList<String>();
        	  l.add("()");
        	  return l;
        }
    	    List<String> l= new ArrayList<String>();
    	    Set<String> hs=new HashSet<String> ();
        for(String str:generateParenthesis(n-1)) {
        	  hs.add(str+"()");
        	  hs.add("("+str+")");
        	  hs.add("()"+str);
        }
        for(String st:hs ) {
        	  l.add(st);
        }
       return l;
    }
   
  

}
