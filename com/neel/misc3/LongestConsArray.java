package com.neel.misc3;

import java.util.Arrays;

public class LongestConsArray {

    static int[] arr={5 , 5 , 3 , 1};

    public static void main(String [] args){
        int maxcount=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=i;
            int count=1;
            while(j<=arr.length-2 && arr[j+1]-arr[j]==1){
                count++;
                j++;
            }
            i=j;
            maxcount=Math.max(maxcount,count);
        }
        System.out.print("Max consecutive:"+maxcount);
    }
}
