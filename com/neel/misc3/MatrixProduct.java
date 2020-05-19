package com.neel.misc3;

public class MatrixProduct {
    static int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        //printMat();
        int x = calcMinMatPrd(0,0);
        System.out.print("**Mat matrix: "+x);

    }

    private static int calcMinMatPrd(int i,int j) {
      // System.out.println("**Traversed "+i+" "+j);
       if(i==mat.length-1 && j==mat[0].length -1){
           return mat[i][j];
       }
       //if(i>mat.length)
       if(i>=mat.length-1){
           return mat[i][j]*calcMinMatPrd(i,j+1);
       }
       if(j>=mat[0].length-1){
           return mat[i][j]*calcMinMatPrd(i+1,j);
       }
       return Math.max(mat[i][j]*calcMinMatPrd(i,j+1),mat[i][j]*calcMinMatPrd(i+1,j));


    }

    private static void printMat() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.print("\n");
        }
    }
}
