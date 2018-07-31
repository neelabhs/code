package com.neel.misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int poisonousPlants(int[] p) {
        Stack<Integer> s=new Stack<Integer>();
        int tmp=-1;
        int max=0;
        int count=0;
        s.push(p[0]);
        for(int i=1;i<p.length;i++){
            if(p[i]<=s.peek()){
                s.push(p[i]);
                tmp=-1;
                max=(max>count)?max:count;
                count=0;
            }
            else if(p[i]>tmp && p[i]>s.peek()){
              if(count==0) {count=1;}  
            	  tmp=p[i];
            }
            else if(p[i]<=tmp && p[i]>s.peek()){
                count++;
                tmp=p[i];
            }
            
            
        }
        max=(max>count)?max:count;
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}

