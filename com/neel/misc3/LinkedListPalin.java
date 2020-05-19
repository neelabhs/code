package com.neel.misc3;

import java.util.ArrayList;
import java.util.List;

public class LinkedListPalin {

    public static void main(String [] args){
        LLNode head=createLinkedList();
        System.out.println("is palindrome:"+isPalindrome(head));
    }

    private static boolean isPalindrome(LLNode head) {
        boolean isPalin=true;

        int len=0;
        LLNode n=head;
        LLNode mid=head;
        while(n!=null){
            len=len+1;
            n=n.next;
        }
        System.out.println("Length is"+len);

        for(int i=0;i<len/2;i++){
            mid=mid.next;
        }

        if(len%2==1){
            mid=mid.next;
        }

        System.out.println("Mid is"+mid.val);

        List<Integer> stack=new ArrayList<>();
        while(mid!=null){
            stack.add(mid.val);
            mid=mid.next;
        }

        LLNode nx=head;
        for(int j=0;j<len/2;j++){
            System.out.println("Comparing: "+nx.val+ " "+ stack.get(stack.size()-1));
            if(nx.val!=stack.remove(stack.size()-1)){
                System.out.println("Did not match: "+nx.val+ " "+ stack.get(stack.size()-1));
                isPalin=false;
                break;
            }
            nx=nx.next;
        }
        return isPalin;
    }

    public static  LLNode createLinkedList(){
        LLNode head=new LLNode(1);
        LLNode n1=new LLNode(2);
        head.next=n1;
        LLNode n2=new LLNode(3);
        n1.next=n2;
        LLNode n3=new LLNode(4);
        n2.next=n3;
        LLNode n4=new LLNode(3);
        n3.next=n4;
        LLNode n5=new LLNode(2);
        n4.next=n5;
        LLNode n6=new LLNode(1);
        n5.next=n6;
        n6.next=null;
        return head;
    }
}


