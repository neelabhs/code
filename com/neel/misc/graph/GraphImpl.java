package com.neel.misc.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GraphImpl {

	public static void main(String[] args) {
		Node n=createGraph();
		Set<Node> tSet=new HashSet<Node>();
		Node newStart=new Node();
		dfsClone(n,newStart,tSet);
		//bfs(n);
        dfs(newStart,new HashSet<Node>());		

	}

	public static Node createGraph() {
		Node   n1=new Node(1);
		Node   n2=new Node(2);
		Node   n3=new Node(3);
		Node   n4=new Node(4);
		Node   n5=new Node(5);
		Node   n6=new Node(6);
		Node   n7=new Node(7);
		n1.nbrs.add(n2);
		n1.nbrs.add(n3);
		n1.nbrs.add(n4);	    
		n2.nbrs.add(n5);
		n3.nbrs.add(n6);
		n4.nbrs.add(n6);
		n6.nbrs.add(n7);
		return n1;
	}

	public static void dfs(Node start,Set<Node> s) {
		if(start==null) return;
		System.out.println(start.val);
		for(Node n:start.nbrs) {
			if(!s.contains(n)) {
				s.add(n);
				dfs(n,s);
			}
		}
	}

	public static void bfs(Node start) {
		Stack<Node> stack=new Stack<Node>();
		Set<Node> tSet=new HashSet<Node>();
		stack.push(start);
		while(!stack.isEmpty()) {
			Node n=stack.pop();
			if(!tSet.contains(n)) {
				System.out.println(n.val);
				tSet.add(n);
				for(Node n1:n.nbrs) {
					stack.push(n1);
				}
			}
		}
	}
	
	public static void dfsClone(Node start,Node newStart,Set<Node> s) {
		if(start==null) return;
		newStart.val=start.val;
		//System.out.println(start.val);		
		for(Node n:start.nbrs) {
			if(!s.contains(n)) {
				Node newChild=new Node();
				newStart.nbrs.add(newChild);
				s.add(n);				
				dfsClone(n,newChild,s);
			}
		}
	}

	public static void bfsClone(Node start) {
		Stack<Node> stack=new Stack<Node>();
		Set<Node> tSet=new HashSet<Node>();
		stack.push(start);
		while(!stack.isEmpty()) {
			Node n=stack.pop();
			if(!tSet.contains(n)) {
				System.out.println(n.val);
				tSet.add(n);
				for(Node n1:n.nbrs) {
					stack.push(n1);
				}
			}
		}
	}

}
