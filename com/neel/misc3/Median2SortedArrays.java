package com.neel.misc3;

public class Median2SortedArrays {
    public static void main(String[] args){
        int[] input1={1,2};
        int[] input2={};
        float median=0;

        //Median is the arr[(n+1)/2] if odd sized or (arr[n/2]+arr[n/2+1])/2

        //repeated numbers
        // 0-1-2-3 sized tot array

        int totSize=input1.length+input2.length;
        int maxSize=(totSize/2)+1;
        int idx1=0;
        int idx2=0;
        int[] tmp=new int[maxSize];
        for(int i=0;i<=maxSize-1;i++){
            if(idx1==input1.length){
                tmp[i]=input2[idx2++];
                continue;
            }
            if(idx2==input2.length){
                tmp[i]=input1[idx1++];
                continue;
            }
            if(input1[idx1]<=input2[idx2]){
                tmp[i]=input1[idx1];
                idx1++;
            }else if(input1[idx1]>input2[idx2]){
                tmp[i]=input2[idx2];
                idx2++;
            }
        }
        if(totSize%2==0){
            median=(float)(tmp[maxSize-2]+tmp[maxSize-1])/2;
        }else{
            median=tmp[maxSize-1];
        }
        System.out.print("median is:"+median);

    }
}
