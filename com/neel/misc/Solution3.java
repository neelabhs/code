package com.neel.misc;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {

	protected static Stack<Integer> curr=new Stack<Integer>();
	protected static Stack<Integer> prev=new Stack<Integer>();
	protected static Stack<Integer> tmp;    
	protected static int lastOp;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nop=sc.nextInt();
		while(nop-->0){
			int op=sc.nextInt();
			int val=0;
			if(op==1) {
			  val=sc.nextInt();
			}
			switch(op){
			case 1:{
				enqueue(val);
				break;
			}   
			case 2:{
				int t=dequeue();
				break;
				//System.out.println(t);
			}   
			case 3:{
				print(); 
				break;
			}    
			}
		}



	}


	protected static void enqueue(int v){
		if(lastOp==1){
			curr.push(v);
		}else{
			while(!curr.isEmpty()){
				prev.push(curr.pop());
			}
			prev.push(v);
			lastOp=1;
			tmp=prev;
			prev=curr;
			curr=tmp;
		}
	}

	protected static int dequeue(){
		int x;
		if(lastOp==2){
			x=curr.pop();
		}else{
			while(!curr.isEmpty()){
				prev.push(curr.pop());
			} 
			x=prev.pop();
			lastOp=2;
			tmp=prev;
			prev=curr;
			curr=tmp;
		}
		return x;
	}

	protected static void print(){
		int x;
		if(lastOp==2){
			x=curr.peek();
		}else{
			while(!curr.isEmpty()){
				prev.push(curr.pop());
			} 
			x=prev.peek();
			lastOp=2;
			tmp=prev;
			prev=curr;
			curr=tmp;
		}

		System.out.println(x);
	}


}




