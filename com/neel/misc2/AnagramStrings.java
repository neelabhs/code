package com.neel.misc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramStrings {

	public static void main(String[] args) {
		String[] str= {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> fL=groupAnagrams(str);
		for(List<String> cl:fL) {
			for(String cS:cl) {
				System.out.print(cS+",");
			}
			System.out.print("\n");
		}

	}

    public static List<List<String>> groupAnagrams(String[] strs) {
     	List<List<String>> list=new ArrayList<List<String>>();
    	    HashMap<String,List<String>> hm=new HashMap<String,List<String>>();
    	    for(String s:strs) {
    	    	  char[] c=s.toCharArray();
    	    	  Arrays.sort(c);
    	    	  String nS=new String(c);
    	    	  if(hm.containsKey(nS)) {
    	    		  List<String> li=hm.get(nS);
    	    		  li.add(s);
    	    	  }else {
    	    		  List<String> li=new ArrayList<String>();
    	    		  li.add(s);
    	    		  hm.put(nS, li);
    	    		  list.add(li);
    	    	  }
    	    	  
    	    	
    	    }
    	    return list;
    }
	
}
