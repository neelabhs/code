package com.neel.misc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String[] args) {
		String s="{[()[()]]}[" ;
		boolean match=true;
		char[] carr=s.toCharArray();
		Stack<Character> q=new Stack<Character>();
		Stack<Character> t=new Stack<Character>();
		for(char c:carr) {
			q.add(c);
		}		
		
		while(!q.isEmpty()) {
			if(isClosing(q.peek())) {
				t.add(q.pop());
			}else if(t.isEmpty() || !isMatching(q.pop(),t.pop())) {
			    	match=false;
			    	break;
			}
         }
		
		if(!t.isEmpty() && match) {
			match=false;
		}
		
		System.out.println("Match: "+match);
	}
	
	public static boolean isClosing(char c) {
		if(c=='}'|| c==')' || c==']') {
			return true;
		}
		return false;
	}
	
    public static boolean isOpening(char c) {
    	if(c=='{'|| c=='(' || c=='[') {
			return true;
		}
		return false;
	}
    
    public static boolean isMatching(char c,char d) {
		if((c=='(' && d==')')||(c=='[' && d==']')||(c=='{' && d=='}')) {
			return true;
		}
		return false;
	}

}
