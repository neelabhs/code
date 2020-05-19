package com.neel.misc3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {


    static Map<Character, Integer> paranMap = new HashMap<>();

    public static void main(String[] args) {
        String paranComb = "[({}[()])";
        createMap();
        System.out.print("Is valid paranthese combination: " + isValidParan(paranComb));
    }

    private static boolean isValidParan(String paranComb) {
        char[] carr = paranComb.toCharArray();
        boolean isValidParan = true;
        Stack<Character> mainStack = new Stack<>();
        Stack<Character> tmpStack = new Stack<>();
        for (char c : carr) {
            mainStack.push(c);
        }
        while (!mainStack.isEmpty()) {
            while (paranMap.get(mainStack.peek()) < 0) {
                tmpStack.push(mainStack.pop());
            }
            if (tmpStack.isEmpty() || paranMap.get(mainStack.peek()) + paranMap.get(tmpStack.peek()) != 0) {
                isValidParan = false;
                break;
            } else {
                mainStack.pop();
                tmpStack.pop();
            }
        }
        return isValidParan;
    }

    public static void createMap() {
        paranMap.put('(', 1);
        paranMap.put(')', -1);
        paranMap.put('[', 2);
        paranMap.put(']', -2);
        paranMap.put('{', 3);
        paranMap.put('}', -3);


    }
}



