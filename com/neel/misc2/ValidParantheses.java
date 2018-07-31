package com.neel.misc2;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		String brackets="[{()}(){}]";
        System.out.println(isBalanced(brackets));
	}
	
	public static boolean isBalanced(String str) {
		boolean match=true;
		char[] crr=str.toCharArray();
		Stack<Character> mStack=new Stack<Character>();
		Stack<Character> sStack=new Stack<Character>();
		
		for(char c:crr) {
			mStack.push(c);	
		}
		
		while(!mStack.isEmpty()) {
			while(isClosing(mStack.peek())) {
				sStack.push(mStack.pop());
			}
			if(!mStack.isEmpty() && !sStack.isEmpty() && isMatch(mStack.pop(),sStack.pop())) {
				continue;
			}else {
				match=false;
				break;
			}
		}
		if(!sStack.isEmpty()) {
			match=false;
		}
		
		return match;
	}
	
	
    public static boolean isOpening(char c) {
    	 if(c=='('||c=='{'||c=='[') {
    		 return true;
    	 }
    	 return false;
    }
	
    public static boolean isClosing(char c) {
    	if(c==')'||c=='}'||c==']') {
   		 return true;
   	 }
   	 return false;
   }
    
    public static boolean isMatch(char c,char d) {
      	if((c=='('&&d==')')||(c=='['&&d==']')||(c=='{'&& d=='}')) {
      	  return true;	
      	}
      	return false;
      }
    
    
}
