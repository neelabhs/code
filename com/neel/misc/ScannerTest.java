package com.neel.misc;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		String[] arr=new String[s];
		int i=0;
		while(s-->0) {
			arr[i++]=sc.next();
		}
		for(String j:arr) {
			System.out.println(j);
		}
	}

}
