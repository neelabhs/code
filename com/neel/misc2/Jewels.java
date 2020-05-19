package com.neel.misc2;

public class Jewels {

    public static  void main(String[] args){
        String J="aA";
        String S="aAAbbCaA";
        int arr[] =new int[256];
        char[] in=J.toCharArray();
        char[] op=S.toCharArray();
        int count=0;
        for(char i:in){
            arr[i]=1;
        }
        for(char o:op){
            if(arr[o]==1){
                count++;
            }
        }
       System.out.print(count);
    }
}
