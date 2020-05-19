package com.neel.misc3;

public class MissingNumber {

    public static void main(String[] args ){
        int [] arr={-1,- 3};
        int res=-1;
        int len=arr.length;
        int[] ref=new int[1000001];
        for(int i=0;i<len;i++){
            if(arr[i]>0){
                ref[arr[i]]=1;
            }
        }
        for(int j=1;j<1000001;j++){
            if(ref[j]!=1){
                res=j;
                break;
            }
        }
        System.out.print( res);
    }


}
