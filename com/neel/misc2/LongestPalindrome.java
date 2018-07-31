package com.neel.misc2;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("bbbbbbbb"));

	}

	
	public static String longestPalindrome(String s) {
		if(s.length()<2) return s;
		if(s.length()==2) {
			if(s.charAt(0)==s.charAt(1)) {
				return s;
			}
		}
		char[] c=s.toCharArray();
		int len=c.length;
		int maxp=0;
		int currl=0;
		int mini=0;
		int maxi=0;

		for(int i=1;i<len-1;i++) {
			int l=0;
			int r=0;
			currl=0;
			
			if(c[i-1]==c[i]) {
				l=i-1;r=i;
			} else if(c[i-1]==c[i+1]) {
				l=i;
				r=i;
			}
			else {
				break;
			}
			
			while(l>=0 && r<len) {
				if(c[l--]==c[r++]) {
					if(maxp<++currl) {
						maxp=currl;
						mini=l+1;
						maxi=r-1;
					}

				}else {
					break;
				}
			}
		}

		return s.substring(mini, maxi+1);
	}
}
