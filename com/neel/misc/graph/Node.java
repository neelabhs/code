package com.neel.misc.graph;

import java.util.ArrayList;

public class Node {

	int val ;
	ArrayList<Node> nbrs;
	
	public Node (int val) {
		this.val=val;
		this.nbrs=new ArrayList<Node>();
	}
	
	public Node () {
		this.nbrs=new ArrayList<Node>();
	}
	
}
