package com.neel.misc3;

import java.util.ArrayList;
import java.util.List;

public class MergeKArrays {

    public static int[][] arr={{1,3,5,7},{2,9,13,15},{4,6,8,10}};

    public static void main(String[] args) {
        /*int[] arr1 = {2, 4, 6,8,10,12,14,16,18};
        int[] arr2 = {1, 3, 5, 7, 9, 11};
        int[] response = merge2Arr(arr1, arr2);
        for (int c : response) {
            System.out.print(c + " ");
        }*/
        int[] res=mergeKArr(0,arr.length-1);
        for (int c : res) {
            System.out.print(c + " ");
        }
    }

    public static int[] mergeKArr(int s, int e){
        System.out.print(s+ " "+e+"\n");
        if(s>=e) return arr[s];

        //if((e-s)==1)
        return merge2Arr(mergeKArr(s,(s+e)/2),mergeKArr((s+e)/2+1,e));

    }



    public static int[] merge2Arr(int[] a, int[] b) {
        int newSize = a.length + b.length;
        int size1 = a.length;
        int size2 = b.length;

        int[] res = new int[newSize];

        int x = 0;
        int y = 0;

        for (int i = 0; i < newSize; i++) {
            if (x >= size1 && y < size2) {
                res[i] = b[y++];
            } else if (y >= size2 && x < size1) {
                res[i] = a[x++];
            } else {
                if (a[x] < b[y]) {
                    res[i] = a[x++];
                } else {
                    res[i] = b[y++];
                }
            }
        }
        return res;

    }

}
