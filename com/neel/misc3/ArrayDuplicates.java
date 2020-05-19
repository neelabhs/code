package com.neel.misc3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {

    static int[] arr={7,3,2,5,6,3,7,8,2,1};

    public static void main(String[] args){
       Set<Integer> res=new HashSet<>();
       for(int i=0;i<arr.length;i++){
           int idx = Math.abs(arr[i])-1;
           if(Math.abs(arr[idx])<0){
               arr[idx]*=-1;
           }
       }
       for(int x=0;x<arr.length;x++){
           if(arr[x]>0){
               res.add(x+1);
               System.out.print((x+1)+" ");
           }
       }
    }
}
