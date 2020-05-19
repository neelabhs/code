package com.neel.misc3;

import java.util.*;

public class Testing {

    public static void main(String[] args){
        PriorityQueue q=new PriorityQueue();
        q.add(2);
        q.add(7);
        q.add(9);
        q.add(4);
        q.add(8);
        q.add(1);


        q.forEach(i->{System.out.println(i);});

    }
}
