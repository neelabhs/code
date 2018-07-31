package com.neel.misc;

public class Sample {
public static void main(String[] args) {
	String s="ab";
	//System.out.println(removeAt(s,1));
	permutation("","abc");
	//System.out.println(s.substring(1, s.length()));
}

public static String removeAt(String s,int index) {
	String retString=new String();
	if(s==null || s.length()<=1) {
		retString="";
	}else {
		retString=s.substring(0, index)+s.substring(index, s.length());
	}
	
	
	return retString;
}


private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

}
