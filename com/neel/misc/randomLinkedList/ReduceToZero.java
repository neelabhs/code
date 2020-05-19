package com.neel.misc.randomLinkedList;

public class ReduceToZero {
    public static void main(String[] args){
        int input=2765;
        int steps=0;
        while(input!=0){
            steps++;
            if(input%2==0){
                input/=2;
            }else{
                input-=1;
            }
        }
        System.out.print("Number of steps"+steps);
    }
}
