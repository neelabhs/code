package com.neel.misc2;

public class CanBeReached {
	
	public static void main(String[] args) {
     	System.out.println("No of ways "+ cbr(2,1));	

	}

	
	public static int cbr(int x,int y) {
		int[][] mat=new int[x][y];
		 for(int i=0;i<x;i++) {
			 for(int j=0;j<y;j++) {
				 mat[i][j]=-1;
			 }
		 }  
	     return cbr1(x-1,y-1,mat);
	     
	}
	
	
	public static int cbr1(int x,int y,int[][] mat) {
		if(x<0||y<0) return 0;
		if(x==0 && y==0) return 0;
		if((x==0 && y==1) || (x==1 && y==0)) return 1;
		
		int left=(x>0 && y>0 && mat[x][y-1] !=-1)?mat[x][y-1]:cbr1(x,y-1,mat);
		int right=(x>0 && y>0 && mat[x-1][y]!=-1)?mat[x-1][y]:cbr1(x-1,y,mat);		
		
		mat[x][y]= 	left+right;
		return mat[x][y];
	}
}
