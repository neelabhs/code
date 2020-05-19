package com.neel.misc3;

import java.util.HashMap;
import java.util.Map;

public class FibAgain {

    public static Map<Integer,Integer> memoMap=new HashMap<>();
    public static void main(String[] args){
        System.out.print("Fib is : "+fib(6));
    }

    public static int fib(int x){
        if(x==1 || x==2 || x==0)
            return x;
        int fib1=memoMap.containsKey(x-1)?memoMap.get(x-1):fib(x-1);
        int fib2=memoMap.containsKey(x-2)?memoMap.get(x-2):fib(x-2);
        int fib=fib1+fib2;
        memoMap.put(x,fib);
        return fib;
    }


}
