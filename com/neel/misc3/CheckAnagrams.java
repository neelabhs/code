package com.neel.misc3;

import java.util.HashMap;

public class CheckAnagrams {

    public static void main(String [] args){
        String s1="ABCD";
        String s2="abcd";
        //A=65-91 a=97-123    d=32
        System.out.print("Is anagram:"+isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int[] alpha=new int[26];
        boolean isAna=true;
        for(char c:c1){
            int i=0;
            if(c>=97){
                i=c-97;
            }else {
                i = c - 65;
            }
            alpha[i]++;
        }
        for(char c:c2){
            int i=0;
            if(c>=97){
                i=c-97;
            }else {
                i = c - 65;
            }
            alpha[i]--;
        }
        for(int x:alpha){
            if(x!=0){
                isAna=false;
            }
        }
        return isAna;
    }

}
