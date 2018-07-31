package com.neel.misc2;

import java.util.ArrayList;
import java.util.List;


public class IntPermutation {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		permute(arr);
	}
	
    public static  List<List<Integer>> permute(int[] nums) {
    	  List<Integer> pre=new ArrayList<Integer>() ;
    	  List<Integer> post=new ArrayList<Integer>();
    	  for(int k:nums) {
    		  post.add(k); 
    	  }
    	  
   	  List<List<Integer>> res= new ArrayList<List<Integer>>();
	    permutate(pre,post,res);
    	 
    	  for(List<Integer> li:res ) {
    		  for(int k:li){
    			  System.out.print(k+",");
    		  }
    		  System.out.print("\n");
    	  }
	  
	  
    	  return res;
    }

    
    public static void permutate(List<Integer> pre,List<Integer> post,List<List<Integer>> res) {
    	   if(post.isEmpty()) {
    		   res.add(pre);
    		   return;
    	   }   	   
    	   for(int i=0;i<post.size();i++) {
    		   List<Integer> nPre= new ArrayList<Integer>(pre);
    		   List<Integer> nPost= new ArrayList<Integer>(post);
    		   nPre.add(post.get(i));
    		   nPost.remove(i);
    		   permutate(nPre,nPost,res);
    	   }
     }
    
    
}
