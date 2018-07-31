package com.neel.misc2;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {
		List<Interval> list=createList();
		printList(list,"After create");
		List<Interval> newList=merge(list); 
		printList(list,"After merge");
		
		
		
		
	}
	
   
	public  static List<Interval> merge(List<Interval> l) {
        if(l.size()==0) return null;
        if(l.size()==1) return l;
		
		for(int i=1;i<l.size();i++) {
			if(l.get(i-1).end>=l.get(i).start) {
				Interval nI=new Interval(l.get(i-1).start,l.get(i).end);
				l.remove(i-1);
				l.remove(i-1);
				l.add(i-1, nI);
				i--;
			}
			//printList(l,"After for");
		}
		
		
		return l;
    }
	
	public static void printList(List<Interval> l,String msg) {
		System.out.println(msg);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).start+" "+l.get(i).end);
		}
	}
	
	public static List<Interval> createList(){
		List<Interval> l=new ArrayList<Interval>();
		Interval l1=new Interval(1,3);
		Interval l2=new Interval(2,8);
		Interval l3=new Interval(7,10);
		Interval l4=new Interval(9,12);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		return l;
	}
	
}

 class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}