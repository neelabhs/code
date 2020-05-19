package com.neel.misc3;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    public static Queue<Integer> q=new LinkedList<>();
    public static Queue<Integer> temp =new LinkedList<>();

    public static void main(String[] args){

        push(1);
        push(2);
        push(3);
        push(4);
        System.out.println( pop());
        System.out.println( pop());
        push(5);
        push(6);
        System.out.println( pop());

    }

    public static Integer pop(){
        Integer res=null;
        while(!q.isEmpty()){
            int x=q.poll();
            if(q.isEmpty()){
                res=x;
            }else{
                temp.add(x);
            }
        }
        Queue<Integer> tmp=temp;
        temp=q;
        q=tmp;
        return res;
    }


    public static void push(int x){
       q.add(x);
    }


}

