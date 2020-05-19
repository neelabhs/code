package com.neel.misc3;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Integer,Integer> store=new HashMap<>();
    public static void main(String[] args){
        long s=System.currentTimeMillis();
        int f=calcFib(60);
        System.out.println("**Fib for "+6+" is:"+f);
        long elapsed=System.currentTimeMillis()-s;
        System.out.println("**Time taken: "+elapsed);
    }

    private static int calcFib(int x) {
        if(x==1 || x==2){
            return x;
        }
        return useMEmo(x-1)+useMEmo(x-2);
    }

    static int useMEmo(int y){
        int fib1=0;
        if(store.containsKey(y)){
            fib1=store.get(y);
        }else{
            fib1=calcFib(y);
            store.put(y,fib1);
        }
        return fib1;
    }

}
