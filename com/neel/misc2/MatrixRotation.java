package com.neel.misc2;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] mat= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		int n=mat[0].length;
		int i=0;
		int t;
		int u;
		int v;
		while(n>0) {
			for(int j=0;j<n-1;j++) {
				
				t=mat[j+i][n-1+i];
				
				mat[j+i][n-1+i]=mat[i][j+i];
				
				u=mat[n-1+i][n-1-j+i];
				mat[n-1+i][n-1-j+i]=t;
				
				v=mat[n-1-j+i][i];
				mat[n-1-j+i][i]=u;
				
				mat[i][j+i]=v;
				
			}
			n=n-2;
			i++;
		}
		
		System.out.println("********************");
		
		for(int p=0;p<5;p++) {
			for(int q=0;q<5;q++) {
				System.out.print(mat[p][q]+" ");
			}
			System.out.print("\n");
		}

	}

}
