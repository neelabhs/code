package com.neel.misc3;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr={12,56,34,11,23,2,4,6,34,26,89,123,224,345};

        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }


}
