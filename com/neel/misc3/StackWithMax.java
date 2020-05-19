package com.neel.misc3;

import java.util.ArrayList;
import java.util.List;

public class StackWithMax {

    public static List<Integer> stack=new ArrayList<>();
    public static List<Integer> maxStack=new ArrayList<>();

    public static void main(String[] args){
          push(1);
          push(8);
          push(3);
          push(9);
          push(2);
          push(6);
          System.out.println("maxStack"+maxStack);
          System.out.println(max());
          pop();
          pop();
          System.out.println("maxStack2"+maxStack);
          pop();
         System.out.println("maxStack3"+maxStack);
          System.out.println(max());
    }

    public static int pop(){
       int res= stack.remove(stack.size()-1);
       if(res==maxStack.get(maxStack.size()-1)){
           maxStack.remove(maxStack.size()-1);
       }
       return res;
    }

    public static  void push(int x){
        stack.add(x);
        if(maxStack.isEmpty()||maxStack.get(maxStack.size()-1)<x){
            maxStack.add(x);
        }

    }

    public static int max(){
        return maxStack.get(maxStack.size()-1);
    }

}
