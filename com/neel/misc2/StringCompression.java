package com.neel.misc2;

import java.util.Scanner;

public class StringCompression {
	
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  System.out.println(strCom(s));	
	}
	
	public static String strCom(String s) {
		char[] carr=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		int j=0;
		while(j<carr.length) {
			int rep=1;
			sb.append(carr[j]);
			while(j<carr.length-1 && carr[j]==carr[j+1]) {
				rep++;
				j++;
			}
			if(rep>1) {
				sb.append(rep);
			}
			j++;
		}
		
		return sb.toString();
	}

}
