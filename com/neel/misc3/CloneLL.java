package com.neel.misc3;

import java.util.*;

public class CloneLL {

    public static void main(String[] args){
        LL2Node head=createList();
        LL2Node cloneHead=headclone(head);
        System.out.print("Done");
    }

    private static LL2Node headclone(LL2Node node) {
        Set<LL2Node> visited=new HashSet<>();
        //visited.add(node);

        LL2Node newHead=new LL2Node(node.val);

        Map<LL2Node,LL2Node> mapOldNew=new HashMap();
        mapOldNew.put(node,newHead);

       Queue<LL2Node> q=new LinkedList<>();
       q.add(node);

       while(!q.isEmpty()){
           LL2Node curr=q.poll();
           LL2Node newCurr= mapOldNew.get(curr);
           for(LL2Node n:curr.children){
               if(!visited.contains(n) && n!=null){
                    LL2Node newChild=new LL2Node(n.val);
                    newCurr.children.add(newChild);
                    mapOldNew.put(n,newChild);
                    q.add(n);
               }
           }
           visited.add(curr);
       }
     return newHead;

    }

    public static LL2Node createList(){
        LL2Node head=new LL2Node(1);
        LL2Node n1=new LL2Node(2);
        LL2Node n2=new LL2Node(3);
        LL2Node n3=new LL2Node(4);

        head.children.add(n2);
        head.children.add(n1);

        n1.children.add(head);
        n1.children.add(n2);

        n2.children.add(n2);
        n2.children.add(n3);

        n3.children.add(n1);
        n3.children.add(null);

        return head;
    }

}



class LL2Node{
    List<LL2Node> children ;
    int val;

    LL2Node(int val){
        this.val=val;
        children=new ArrayList<>();
    }
}
