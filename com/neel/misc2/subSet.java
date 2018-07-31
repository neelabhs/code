package com.neel.misc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {

	public static void main(String[] args) {
		//Integer[] arr= {1,2,3};
        //List<Integer> li=new ArrayList<Integer>(Arrays.asList(arr));
		int[] arr= {1,2,3};
		//subset(li);
        subsets(arr);
	}
	
	public static void subset(List<Integer> l ) {
	  if(l.isEmpty()) return;
	  for(Integer i:l) {
		  System.out.print(i);
	  }
	  System.out.println("");
	  for(int j=0;j<l.size();j++) {
		  List<Integer> newList=new ArrayList<Integer>(l);
		  newList.remove(j);
		  subset(newList);
	  }
	}
	  
	  
	  public static List<List<Integer>> subsets(int[] nums) {
		    List<List<Integer>> list = new ArrayList<>();
		    Arrays.sort(nums);
		    backtrack(list, new ArrayList<>(), nums, 0);
		    return list;
		}

		private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
		    list.add(new ArrayList<>(tempList));
		    for(int i = start; i < nums.length; i++){
		        tempList.add(nums[i]);
		        backtrack(list, tempList, nums, i + 1);
		        tempList.remove(tempList.size() - 1);
		    }
	  
	  
	}

}
