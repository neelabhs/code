package com.neel.misc3;

public class FindNumberInSortedMatrix {

    public static int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    public static void main(String[] args){
      System.out.print(find(10,mat));
    }

    private static boolean find(int n, int[][] mat) {
        boolean res=false;

        int sr=0;
        int er=mat.length-1;

        while(er>=sr){
            int mid=(sr+er)/2;
            if(n<mat[mid][0]){
                er=mid-1;
            }else if(n>mat[mid][mat[mid].length-1]){
                sr=mid+1;
            }else {
                int sc=0;
                int ec=mat[mid].length-1;
                while(ec>=sc){
                    int midc=(sc+ec)/2;
                    if(n<mat[mid][midc]){
                        ec=midc-1;
                    }else if(n>mat[mid][midc]){
                        sc=midc+1;
                    }else if(n==mat[mid][midc]){
                        res=true;
                        break;
                    }
                }
            }
            if(res)break;
        }
       return res;
    }


}
