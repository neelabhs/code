package com.neel.misc3;

public class LargestSquareSubmatrix {

    static int[][] arr={{1,1,1,0},
                        {1,0,1,1},
                        {1,1,1,0}
                        };
    public static void main(String[] args){
        int maxGlobal=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                //for every i,j
                if(arr[i][j]==1) {
                    int a = 1;
                    for (; a < arr.length - i && a < arr[0].length - j; a++) {
                        boolean isSq = true;
                        for (int x = i; x <= i + a; x++) {
                            for (int y = j; y <= j + a; y++) {
                                if (arr[x][y] != 1) {
                                    isSq = false;
                                    break;
                                }

                            }
                            if (!isSq) break;
                        }
                        if (!isSq) {
                            break;
                        }

                    }
                    maxGlobal=Math.max(maxGlobal, a);
                }
            }
        }
        System.out.print("Max sq is:"+maxGlobal);
    }

}
