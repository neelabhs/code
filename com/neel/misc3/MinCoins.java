package com.neel.misc3;

public class MinCoins {

    public static int[] arr={1,5,10,25};
    public static void main(String[] args){

        System.out.println("Min number of coins: "+ minCoins(7));
    }

    private static int minCoins(int x) {
        if(x==0) return 0;
        int min=x;
        for(int y:arr){
            if(x>y){
                min=Math.min(minCoins(x-y)+1,min);
            }
        }
        return min;
    }
}
