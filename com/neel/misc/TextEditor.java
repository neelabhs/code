package com.neel.misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class TextEditor {

	
	protected static LinkedList<String> lList=new LinkedList<String>();
	protected static Stack<String> undoStack=new Stack<String>();
	

	public static void main(String[] args) {
		
		int[] p=new int[5];
		//p.l

		Scanner sc=new Scanner(System.in);
		int nOp=sc.nextInt();
		while(nOp-->0) {
			int op=sc.nextInt();

			switch(op) {
			case 1: {
				String str=sc.next();
				append(str) ;
				
				break;
			}
			case 2:{
				int k=sc.nextInt();
				delete(k);
				
				break;
			}
			case 3:{
				int k=sc.nextInt();
				print(k);
				break;
			}
			case 4:{
				undo();
				break;
			}
			}
		}

	}

	protected static void append(String str) {
       lList.add(str);
       undoStack.push("1,"+str);
	}

	protected static void delete(int k) {
		String rem=lList.remove(k);
		undoStack.push("2,"+k+","+rem);
	}

	protected static void print(int k) {
		System.out.println(lList.get(k));
	}

	protected static void undo() {
		String undoStr=undoStack.pop();
		String[] undoArr=undoStr.split(",");
		if(undoArr[0].equals("1")) {
			String undoAppend=undoArr[1];
			int idx=lList.lastIndexOf(undoAppend);
			
			lList.remove(idx);
		}else{
			String remIdx=undoArr[1];
			String undoDelete=undoArr[2];
			lList.add(Integer.parseInt(remIdx), undoDelete); 
		}

	}



}
