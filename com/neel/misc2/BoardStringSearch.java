package com.neel.misc2;

import java.util.ArrayList;

public class BoardStringSearch {
	public static void main(String[] args) {
     	char[][] board= {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		System.out.println(exist(board,"ABCESEEEFS"));

	}
	
	public static boolean exist(char[][] board, String word) {		
		ArrayList<int[]> al=new ArrayList<int[]>();
		if(word.length()==0 || board.length==0) return false;
		int x = board.length;
		int y = board[0].length;
		for(int r=0;r<x;r++) {			
			for(int c=0;c<y;c++) {
				if(word.charAt(0)==board[r][c]) {
					int[] cd=new int[2];
					cd[0]=r;
					cd[1]=c;
					al.add(cd);
				}
			}
		}		
		for(int[] coord:al) {
			boolean[][] isTraversed=new boolean[x][y];
			if(search(coord[0],coord[1],board,word,isTraversed)) return true;
		}

		return false;
	}
	
	

	public static boolean search(int x,int y,char[][] b, String w,boolean[][] t) {
		if(w.length()==0) return true;
		if(x>b.length-1 || y>b[0].length-1||x<0||y<0) return false;
		if(t[x][y]) return false;
     	if(b[x][y]==w.charAt(0)) {
			t[x][y]=true;			
			if(search(x+1,y,b,w.substring(1),t)||search(x,y+1,b,w.substring(1),t)||search(x-1,y,b,w.substring(1),t)||search(x,y-1,b,w.substring(1),t)) return true;			
		}
		return false;
	}

	
	
	
   
    /*private static boolean search(char[][] board, int[] coord, String word) {
        int a=board.length-1;
        int b=board[0].length-1;
    	    boolean[][] isTraveresed=new boolean[a+1][b+1];
    	    char[] carr=word.toCharArray();
    	    int x=coord[0];
    	    int y=coord[1];
    	    isTraveresed[x][y]=true;
    	    for(int j=1;j<carr.length;j++) {
    	    	  char c=carr[j];
    	    	  if(x<a && board[x+1][y]==c && !isTraveresed[x+1][y] ) {
    	    		  isTraveresed[x+1][y]=true; 
    	    		  x=x+1;
    	    	  }else if(y<b && board[x][y+1]==c && !isTraveresed[x][y+1]) {
    	    		  isTraveresed[x][y+1]=true;
    	    		  y=y+1;
    	    	  }else if(x>0 && board[x-1][y]==c && !isTraveresed[x-1][y]) {
    	    		  isTraveresed[x-1][y]=true;
    	    		  x=x-1;
    	    	  }else if(y>0 && board[x][y-1]==c && !isTraveresed[x][y-1]) {
    	    		  isTraveresed[x][y-1]=true;
    	    		  y=y-1;
    	    	  }else {
    	    		  return false;
    	    	  }
    	    }
	    return true;
     } 	 */
   
	
}
