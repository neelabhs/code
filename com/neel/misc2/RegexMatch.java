package com.neel.misc2;

import java.util.ArrayList;
import java.util.Arrays;

public class RegexMatch {

	public static void main(String[] args) {
		String s="ab";
		String p=".*";
	    System.out.println(isMatch(s,p));

	}
	
	
	public static boolean isMatch(String sr, String pr) {
		boolean isMatch=true;
		char[] s=sr.toCharArray();
		char[] p=pr.toCharArray();
		int j=0;
		int i;
		char prev=' ';
		
		if(p==null || p.length==0) {
			return true;
		}else if(s==null || s.length==0){
			return false;
		}
		
		for( i=0;i<s.length && j<p.length ;i++) {
			
			if(s[i]==p[j]) {
				j++;
				continue;
			}else if(p[j]=='.') {
				if(j<p.length-1 && p[j+1]=='*') {
					prev=s[i];
				}
				j++;
				continue;
			}else if(p[j]=='*') {
				if(prev==' ' && j>0) {
					prev=p[j-1];
				}
				if(prev==s[i]) {
					if(!(i<s.length-1 && s[i+1]==s[i])){
						j++;
					}
				}else {
					isMatch=false;
					break;
				}
				
			}else if(j<p.length-1 && p[j+1]=='*'){
			  j++;
			}else {
				isMatch=false;
				break;
			}
		}
		if(!(i==s.length&&j==p.length)) {
			isMatch=false;
		}
	return isMatch;
	}

}
