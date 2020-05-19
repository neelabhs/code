package com.neel.misc3;

import java.util.Stack;

public class InvertWordsInSentence {

    public static void main(String[] args) {
        String sentence = "how are you";
        System.out.print("Reverse: " + reverseWords(sentence));

    }

    private static String reverseWords(String sentence) {
        char[] carr = sentence.toCharArray();
        char[] res = new char[carr.length];
        Stack<Character> stack = new Stack<>();
        int i=0;
        int j=0;
        while (i < carr.length) {
            while (i<=carr.length-1 && carr[i] != ' ' ) {
                stack.push(carr[i++]);
            }
            while (!stack.isEmpty()) {
                res[j++] = stack.pop();
            }
            i++;
            if(i<=carr.length-2) res[j++]=' ';
        }
        String respString = new String(res);
        return respString;
    }


}


