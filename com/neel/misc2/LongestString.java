package com.neel.misc2;

import java.util.HashSet;

public class LongestString {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	
	public  static int lengthOfLongestSubstring(String s) {
		int maxLen=0;
		int currLen=0;
		HashSet<Character> hash=new HashSet<Character>();
		char[] c=s.toCharArray();
		int slen=c.length;
		int i=0;
		while(i<slen) {
			currLen=0;  
			hash.clear();
			int j=i;
			while(j<slen && !hash.contains(c[j])) {
				currLen++; 
				hash.add(c[j]);
				j++;
			}
			i++;
     		maxLen=Math.max(maxLen, currLen);        	  
		}
		return maxLen;
	}

}
