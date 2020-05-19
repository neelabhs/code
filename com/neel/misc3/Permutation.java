package com.neel.misc3;

public class Permutation {



    public static void main(String[] args){
        String str="abcde";
        perm("",str);
    }

    public static void perm(String pre,String suff){
        if(suff.length()==0){
           System.out.println(pre);
           return;
        }
        for(int i=0;i<suff.length();i++){
            String newPre=pre+suff.charAt(i);
            String newSuff=removeAt(suff,i);
            //System.out.println("pre: "+pre+" suff: "+newSuff);
            perm(newPre,newSuff);
        }
    }

    public static String removeAt(String s,int i){
        String newStr;
        if(s.length()==1){
            newStr="";
        }
        else if(i==s.length()-1){
            newStr= s.substring(0,i);
        }
        else if(i==0){
            newStr=s.substring(1,s.length());
        }else{
            newStr=s.substring(0,i).concat(s.substring(i+1,s.length()));
        }
       //System.out.println("idx: "+i+"orig: "+s+" remove at: "+ newStr);
        return newStr;
    }


}

