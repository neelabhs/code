package com.neel.misc;

public class TestClass {
	
	public static void main(String[] args) {
		String[] str= {"r","a","a","a","r","r","r"};
		int[] val= {1,1,2,1,1,2,1};
		median(str,val);
	}
	
	static void median(String a[],int x[]) {
        int max=0;
        int n=a.length;
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            String op=a[i];
            int opVal=x[i];         
            switch(op){
                case "a":{
                   insert(arr,opVal,max);
                   max++;
                   median(arr,max); 
                   break;
                }
                case "r":{
                   if( delete(arr,opVal,max)) {
                    if(max>0)
                       max--;
                    median(arr,max);
                }else{
                	 System.out.println("Wrong!");
                }
                break;   
              }
                    
            }           
          }      
    }
    
    public static void insert(int[] a,int val,int m){
        int i=0;
        //empty array
        if(m==0){
            a[0]=new Integer(val);         
            //return a;
        } else {
        while(val>a[i] && i<m){
            i++;
        }
        System.arraycopy(a,i,a,i+1,m-i+1);
        a[i]=val;           
        }
    }
    
    public static boolean delete(int[] a,int val,int m){
        
        boolean found=false;
        if(m>0){
          for(int j=0;j<=m;j++){
            if(a[j]==val){
                System.arraycopy(a,j+1,a,j,m-j+1);
                found=true;
                break;
            }
          }
        }
        
        return found;
        
    }
    
    
    public static void median(int[] arr,int m){
        if(m==0){
            System.out.println("Wrong!");
            
        }else {
        if((m%2)==0){
        	    float x=(float)(arr[m/2-1]+arr[m/2])/2;
            System.out.println(x);
        }else{
           //float y=
        	  System.out.println(arr[(m-1)/2]);
        }
        }
        
        
    }

}
