package com.neel.misc3;

import java.util.HashMap;
import java.util.Map;

public class Knapsack {

    static Map<Integer,Integer> map =new HashMap();
    public static void main(String[] args){
        map.put(1,6);
        map.put(2,10);
        map.put(3,12);
       long l = System.currentTimeMillis();
       int max= knapsack(5);
        System.out.println("MAX value is: "+ max );
        System.out.print("Time taken in millis:"+(System.currentTimeMillis()-l));
    }

    private static int knapsack(int max) {
        if(max<0){
            return Integer.MIN_VALUE;
        }
        if(max==0){
            return 0;
        }
        int currMax=0;
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            int key=x.getKey();
            int val=x.getValue();
            if (key <= max) {
              int value= val+knapsack(max-key);
              currMax=Math.max(currMax,value);
            }
        }
        return currMax;
    }


}
