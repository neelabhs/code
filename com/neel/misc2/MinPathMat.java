package com.neel.misc2;

public class MinPathMat {

	public static void main(String[] args) {
		int[][] mat= {{1,3,1},{1,5,1},{4,2,1}};
		//int[][] mat= {{1,3,1}};
		System.out.println(minPathSum( mat));
	}
	
	public static  int minPathSum(int[][] mat) {
		int m=mat.length;
		int n=mat[0].length;
		int[][] res=new int[m][n];
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 res[i][j]=-1;
			 }
		 }  
		
		return minPath(0,0,mat,res);
	}

	public static int minPath(int x,int y,int[][] mat,int[][] res) {
		int m=mat.length;
		int n=mat[0].length;
		if(m==0 && n==0) return 0;
		if(m==1 && n==1) return mat[0][0];
		if(x>m-1||y>n-1) return Integer.MAX_VALUE;
		if(x==m-1 && y== n-1) return mat[x][y];
		
		int rt=(x<m-1 && y<n-1 && res[x][y+1]!=-1)?res[x][y+1]:minPath(x,y+1,mat,res);
		int dn=(x<m-1 && y<n-1 && res[x+1][y]!=-1)?res[x+1][y]:minPath(x+1,y,mat,res);
		
		res[x][y]= Math.min((rt==Integer.MAX_VALUE)?Integer.MAX_VALUE:mat[x][y]+rt,(dn==Integer.MAX_VALUE)?Integer.MAX_VALUE:mat[x][y]+dn);
	    return res[x][y];	
	}
	
}
