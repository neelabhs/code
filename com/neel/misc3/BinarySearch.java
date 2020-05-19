package com.neel.misc3;

public class BinarySearch {

    public static int[] arr={2,5,8,9,11,32,46,76,88,99,112,334,445,667,778,889};

   public static void main(String[] args){
     System.out.print("Number found at index:"+search(1,0,arr.length-1));
    }

    private static int search(int i,int s,int l) {
       int mid=(s+l)/2;
       if(arr[mid]==i){
           return mid;
       }
        if(l<=s||s>=l) {
            return -1;
        }
       if(i<arr[mid]){
           return search(i,s,mid-1);
       }else{
           return search(i,mid+1,l);
       }
       //return -2;
    }


}
