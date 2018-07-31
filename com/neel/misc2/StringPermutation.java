package com.neel.misc2;



public class StringPermutation {
	
	public static void main(String[] args) {
		String str="abcd";
		perm("",str);	
	}
	
	public static void perm(String pre,String post) {
		if(post.length()==0) System.out.println(pre);
		for(int i=0;i<post.length();i++) {
			perm(pre+post.charAt(i),post.substring(0,i)+post.substring(i+1,post.length()));
		}
 
	}
	
	public String removeAt(String s,int i) {
		String retString=new String();
		if(s==null || s.length()<=1) {
			retString="";
		}else {
			retString=s.substring(0, i)+s.substring(i, s.length());
		}
		
		
		return retString;
	}

}

