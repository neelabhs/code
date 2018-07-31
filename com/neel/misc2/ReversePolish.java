package com.neel.misc2;

import java.util.Stack;

public class ReversePolish {

	public static void main(String[] args) {
		//char[] exp= {'2','1','+','3','*'};
		//String[] exp={"2","1","+","3","*"};
		String[] exp={"4","13","5","/","+"};
		Stack<String> s1=new Stack<String>();
		Stack<String> s2=new Stack<String>();

		//Populate s1
		for(int j=exp.length-1;j>=0;j--) {
			s1.push(exp[j]);
		}
		
		while(!s1.isEmpty()) {
			while(!isOperator(s1.peek())) {
				s2.push(s1.pop());
			}
			s2.push(calc(s2.pop(),s1.pop(),s2.pop()));
		}
		System.out.println(s2.pop());
		
	}
	
	public static  boolean isOperator(String c) {
		if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")) {
			return true;
		}else {
			return false;	
		}
	}
	
	public static String calc(String a,String b,String c) {
		int op1=Integer.parseInt(a);		
		int op2=Integer.parseInt(c);
		int result=0;
		switch(b){
		
		case "+":{
			result=op1+op2;
			break;
		}
		case "-":{
			result=op1-op2;
			break;
		}
		case "*":{
			result=op1*op2;
			break;
		}
		case "/":{
			result=op1==0?0:op2/op1;
			break;
		}
		
			
		}
		
		return Integer.toString(result);
	}

}
