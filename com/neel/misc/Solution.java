package com.neel.misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{1 ,1, 1 ,0 ,0, 0},{0 ,1, 0 ,0 ,0, 0},{1 ,1, 1 ,0 ,0, 0},{0 ,0, 2 ,4 ,4, 0},{0 ,0, 0 ,2 ,0, 0},{0 ,0, 1 ,2 ,4, 0}};
      
        int max=Integer.MIN_VALUE;
        int currSum=0;
     
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                currSum=sumMat(arr,x,y);
                System.out.println(currSum);
                if(currSum>=max){
                    max=currSum;
                }
            }
        }
        System.out.print(max);
    }
    
    public static int sumMat(int[][] arr,int i,int j){
        int sum=0;
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                if(!((a==0 && b== 1)||(a==2&&b==1))){
                    sum+=arr[i+b][j+a];
                }
            }
        }
        return sum;
    }
}