package com.neel.misc2;

public class ZigZagConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING", 2));
	}

	public static String convert(String s, int n) {
		if (s==null || s.length()==0) return "";
		if(n==1) return s;
		int l=s.length();
		double dCols=((l*(n-1))/2*n)+1;
		int cols=(int)Math.ceil(dCols);
		char[] c=s.toCharArray();
		int cp=0;
		char[][] arr=new char[cols][n];
		StringBuilder res=new StringBuilder();

		for(int i=0;i<cols;i++) {
			for(int j=0;j<n;j++) {
				if(cp<l) {
					if(i%(n-1)==0) {
						arr[i][j]=c[cp++];
					}else {
						if(j==(n-1)-(i%(n-1))) {
							arr[i][j]=c[cp++];
						}else {
							arr[i][j]=' ';

						}
					}
				}else {
					arr[i][j]=' ';
				}
			}
		}

		for(int j=0;j<n;j++) {
			for(int i=0;i<cols;i++) {
				char ca=arr[i][j];
				if(ca!=' ') {
					res.append(ca);
				}
				System.out.print(arr[i][j]+ " ");
			}
			System.out.print("\n");
		}



		return res.toString();
	}

}
