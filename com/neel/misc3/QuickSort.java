package com.neel.misc3;

public class QuickSort {

    static int[] arr={12,56,36,11,23,2,4,6,34,26,89,123,224,345};

    public static void main(String[] args){
        for(int a:arr){
            System.out.print(a+ " ");
        }
        System.out.print("\n");
        quickSort(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void quickSort(int[] arr, int s, int l) {
    //base condition
        if(s>=l)
            return;
        int m=(s+l)/2;
        for(int i=0;i<(l-s);i++){
            if(i<m){
                if(arr[i]>arr[m]){
                    int tmp=arr[i];
                    System.arraycopy(arr,i+1,arr,i,m-i);
                    arr[m]=tmp;
                    m--;
                    i--;
                }
            }else if(i>m){
                if(arr[i]<arr[m]){
                    int tmp=arr[i];
                    System.arraycopy(arr,m,arr,m+1,i-m);
                    arr[m]=tmp;
                    m++;
                    i--;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+ " ");
        }
        System.out.print("\n");
        quickSort(arr,s,m-1);
        quickSort(arr,m+1,l);
    }

}
