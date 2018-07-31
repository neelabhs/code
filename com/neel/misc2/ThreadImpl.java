package com.neel.misc2;

public class ThreadImpl {

	public static void main(String[] args) {		
		Thread t =new Thread() {
			public void  run(){
				for(int i=0;i<100;i++) {
					System.out.println(this.getName()+i);
				}
			}
		};
		t.setName("T1");
		ThreadRun tr=new ThreadRun();
		Thread t2=new Thread(tr,"T2");
		t2.start();
		t.start();

	}

}

class ThreadRun implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {			
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	
}
